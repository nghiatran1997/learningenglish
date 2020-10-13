package com.example.firstspringboot.sevice.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.repository.UsersRepository;
import com.example.firstspringboot.service.UserServices;

@Service
public class UserServiceImp implements UserServices{

	@Autowired
	public UsersRepository userRepository;
	
	@Override
	public List<Users> getAllUsers() {		
		return userRepository.getAllUsers();
	}

	@Override
	public Users authentication(String userName , String password) {
		Users user = userRepository.authentication(userName,password);
		return user;
	}
	
	@Override
	public Integer checkExistUserAPI(String userName) {
		return userRepository.checkExistUserAPI(userName);
	}
	
	@Override
	public Users checkExistUser(String userName) {
		return userRepository.checkExistUser(userName);
	}
	
	@Override
	public Users registNewUser(Users user) {
		return userRepository.save(user);
	}
	
	
}
