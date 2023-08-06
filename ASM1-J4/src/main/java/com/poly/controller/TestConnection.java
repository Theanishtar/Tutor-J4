package com.poly.controller;

import java.util.List;

import com.poly.dao.UserDAO;
import com.poly.model.User;

public class TestConnection {
	public static void main(String[] args) {
		UserDAO uDao = new UserDAO();
		
		List<User> list = uDao.findAll();
		
		for(User u :list) {
			System.out.println(u.getEmail());
		}
	}
}
