package com.example.firstspringboot.service;

import java.util.List;

import com.example.firstspringboot.model.Users;


public interface UserServices {
	
	public List<Users> getAllUsers();
	
	public boolean authentication(String id , String password);

}
