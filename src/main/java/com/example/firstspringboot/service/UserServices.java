package com.example.firstspringboot.service;

import java.util.List;

import com.example.firstspringboot.model.Users;


public interface UserServices {
	
	public List<Users> getAllUsers();
	
	public Users authentication(String userName , String password);
	
	public Users checkExistUser(String userName);
	
	public int registNewUser(Users user);

}
