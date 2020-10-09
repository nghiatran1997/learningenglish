package com.example.firstspringboot.sevice.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.repository.UsersReponsitory;
import com.example.firstspringboot.service.UserServices;

@Service
public class UserServiceImp implements UserServices{

	@Autowired
	public UsersReponsitory userReponsitory;
	
	@Override
	public List<Users> getAllUsers() {		
		return userReponsitory.getAllUsers();
	}

	@Override
	public Users authentication(String userName , String password) {
		Users user = userReponsitory.authentication(userName,password);
		return user;
	}
	
	
}
