package com.poly.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.poly.dao.UserDAO;
import com.poly.model.User;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/views/login.jsp").forward(request, response);

		UserDAO uDao = new UserDAO();

		List<User> list = uDao.findAll();

		for (User u : list) {
			System.out.println(u.getEmail());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = request.getParameter("mail");
		String password = request.getParameter("pass");

		UserDAO userDao = new UserDAO();
		
		User u = userDao.login(email, password);
		
		/*
		 * u = null  -> login fail
		 * u != null -> login success
		 */
		
		if(u == null ) {
			//
			session.setAttribute("loginFail", true);
			
			request.getRequestDispatcher("/views/login.jsp").forward(request, response);
		} else {
			session.setAttribute("user", u);
			if(u.getIsAdmin()) {
				//lấy danh sách users
				List<User> list = new ArrayList<>();
				list = userDao.getUsers();
				
				session.setAttribute("users", list);
				System.out.println(list.get(0).getEmail());
				
				// đưa tới trang admin
				request.getRequestDispatcher("/views/admin/users.jsp").forward(request, response);
			} else {
				session.setAttribute("loginSuccess", true);
				request.getRequestDispatcher("/views/login.jsp").forward(request, response);
			}
		}

		/*
		 * for (User u : dao.findAll()) { if(u.getEmail().equalsIgnoreCase(email) &&
		 * u.getPassword().equals(password)) { // đăng nhập thành công
		 * 
		 * // chức vụ ? ADMIN hay USER
		 * 
		 * // hiển thị danh sách video System.out.println("Đăng nhập thành công");
		 * return; } }
		 */

		
	}

}
