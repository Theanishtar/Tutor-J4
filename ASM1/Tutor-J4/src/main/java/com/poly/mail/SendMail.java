package com.poly.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static boolean sendmail(String to, String subjecta, String from, String bodya) {
		// Đọc thông tin email từ form
		String subject = subjecta;
		String body = "Nội dung: "+bodya;
		//body += "\nLink video :"+link;

		// Thiết lập các thuộc tính của email
		Properties properties = new Properties();
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

		// Đăng nhập vào tài khoản email gửi
//		        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
//		            protected PasswordAuthentication getPasswordAuthentication() {
//		                return new PasswordAuthentication("ryzenV.contact@gmail.com", "ngemudntvdmhwwju");
//		            }
//		        });
		Session session = Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				String username = "Contact.RainbowFlix@gmail.com";
				String password = "qdddlgirbcisthfb";
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Tạo message và thiết lập thông tin
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("your.email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(body);

			// Gửi email
			System.out.println("Dang gui!");
			Transport.send(message);

			// Chuyển hướng về trang thành công
			System.out.println("Gui thanh cong!");
			return true;
		} catch (MessagingException e) {
			// Chuyển hướng về trang thất bại với thông báo lỗi
			System.out.println("Loi!");
			return false;
		}
	}
}
