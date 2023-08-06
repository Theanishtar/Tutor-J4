package com.poly.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poly.mail.SendMail;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("mail");
		String password = request.getParameter("password");
		
		/*for (User u : dao.findAll()) {
			if(u.getEmail().equalsIgnoreCase(email)) {
				// đăng nhập thành công
				
				// chức vụ ? ADMIN hay USER
				
				// hiển thị danh sách video
				System.out.println("Đăng ký thất bại");
				return;
			}
		}*/
		
		// tiến hành: Lưu vào DB
		// Thông báo: ĐK thành công
		System.out.println("Đăng ký thành công");
		
		// Gửi thông báo đến mail (Chào mừng)
		SendMail send = new SendMail();
		send.sendEmail(email, "Thư chào mừng", "", "Hello");
		
	}
	
	
	
	
	
	
	
	
	
	

}
