package com.poly.dao;

import java.util.ArrayList;
import java.util.List;

import com.poly.model.User;

public class UserDAO {
	public List<User> findAll(){
		List<User> list = new ArrayList<>();
		list.add(new User("dang@poly.vn", "admin"));
		list.add(new User("java4@poly.vn", "java4"));
		
		return list;
	}
}
