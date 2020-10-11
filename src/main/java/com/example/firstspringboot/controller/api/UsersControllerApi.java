package com.example.firstspringboot.controller.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspringboot.common.StringUtil;
import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.sevice.imp.UserServiceImp;

@RestController
public class UsersControllerApi {
	
	@Autowired
	private UserServiceImp userServicesImp;
	
	@Autowired
	private StringUtil stringUtil;
		
	@GetMapping("/users")
	public List<Users> getAllUsers() {
		List<Users>  userLst = new ArrayList<Users>();
		for (Users user : userServicesImp.getAllUsers()) {
			try {
				userLst.add((Users) stringUtil.trimReflective(user));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return userLst; 
	}
	
	@GetMapping("/users/{userName}")
	public Users checkExistUser(@PathVariable("userName") String userName) throws Exception {
		return  (Users) stringUtil.trimReflective(userServicesImp.checkExistUser(userName)); 
	}
	

}
