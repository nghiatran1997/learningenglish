package com.example.firstspringboot.service;

import java.util.List;

import com.example.firstspringboot.model.Users;


public interface UserServices {
	
	public List<Users> getAllUsers();
	
	public Users authentication(String userName , String password);
	
	public Integer checkExistUserAPI(String userName);
	
	public Users checkExistUser(String userName);
	
	public Users registNewUser(Users user);

}
