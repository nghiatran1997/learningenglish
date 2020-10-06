package com.example.firstspringboot.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.service.UserServices;

@RestController
public class UsersControllerApi {
	
	@Autowired
	private UserServices userServices;
		
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		return userServices.getAllUsers(); 
	}

}
