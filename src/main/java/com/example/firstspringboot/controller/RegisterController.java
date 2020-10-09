package com.example.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

	@RequestMapping("register")
	public String register(Model model) {	
		return "register";
	}
	
	public String doRegister(Model model) {
		
		return null;
	}
}
