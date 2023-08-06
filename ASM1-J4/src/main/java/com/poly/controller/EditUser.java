package com.poly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.dao.UserDAO;
import com.poly.model.User;

/**
 * Servlet implementation class EditUser
 */
@WebServlet("/CRUD-User")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		
		UserDAO userDao = new UserDAO();
		if(method.equalsIgnoreCase("update")) {
			// cập nhật
		} else {
			// xóa
			Long id = Long.valueOf(request.getParameter("id"));
			User user = userDao.findById(id);
			userDao.delete(user);
			// thông báo xóa thành công!
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserDAO userDao = new UserDAO();
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		userDao.insert(user);
		
		// đưa thông báo thêm thành công
	}

}
