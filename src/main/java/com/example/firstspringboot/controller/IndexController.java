package com.example.firstspringboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.firstspringboot.model.Users;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String indexPage(Model model,HttpSession session) {
		
		Users user = (Users) session.getAttribute("user");
		
		model.addAttribute("user",user);

		return "index";
	}
	
	private void innit() {
		
	}
}
