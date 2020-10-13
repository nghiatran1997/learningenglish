package com.example.firstspringboot.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.sevice.imp.UserServiceImp;

@Controller
public class RegisterController {
	
	final String USER_EXIST = "User name was exist";
	
	final String USER_NAME_NULL ="User name can not be null";
	
	final String NULL_PASWORD ="Password can not be null";
			
	final String NULL_FIRST_NAME = "First name can not be null";
	
	final String NULL_LAST_NAME = "Last name can not be null";
	
	@Autowired
	private UserServiceImp userServiceImp;

	@RequestMapping("register")
	public String register(Model model) {	
		return "register";
	}
	
	@PostMapping("doRegist")
	public String doRegist(@ModelAttribute (value="user") Users user, RedirectAttributes redirectAttributes, HttpSession session) {
		
		List<String> messageLog = registValidate(user);
		if (!messageLog.isEmpty()) {
			redirectAttributes.addFlashAttribute("message",messageLog);
			return "redirect:/register";
		}
		// Insert new User
		insertNewUser(user);
		
		// Setting session
		session.setAttribute("user", user);

		return "redirect:/";
	}
	
	private List<String> registValidate(Users user) {
		List<String> messageLog =  new ArrayList<String>();
		if (user.getUserName() == null) {
			messageLog.add(USER_NAME_NULL);
		} 
		else {

			Users userCheck = userServiceImp.checkExistUser(user.getUserName());
			if (userCheck != null) {
				if (userCheck != null ) {
					messageLog.add(USER_EXIST);
				}
				if (userCheck.getPassWord() == null) {
					messageLog.add(NULL_PASWORD);
				} 
				if (userCheck.getFirstName() == null) {
					messageLog.add(NULL_FIRST_NAME);
				}
				if (userCheck.getLastName() == null) {
					messageLog.add(NULL_LAST_NAME);
				}
			}
		}
		return messageLog;
		
	}
	
	private Users insertNewUser(Users user) {
		return userServiceImp.registNewUser(user);
	}
}
