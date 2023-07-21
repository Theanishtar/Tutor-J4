package com.poly.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.dao.UserDAO;
import com.poly.dao.VideoDAO;
import com.poly.model.User;
import com.poly.model.Video;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/views/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");

		System.out.println(mail + ":" + pass);

		UserDAO dao = new UserDAO();
		for (User u : dao.findAll()) {
			if (u.getEmail().equalsIgnoreCase(mail) && u.getPassword().equals(pass)) {
				VideoDAO vdao = new VideoDAO();
				List<Video> list = vdao.findAll();
				request.setAttribute("email", mail);
				request.setAttribute("videos", list);
				request.getRequestDispatcher("/views/videos.jsp").forward(request, response);
			}
		}
	}

}
