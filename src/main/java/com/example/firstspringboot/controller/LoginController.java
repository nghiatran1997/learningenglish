package com.example.firstspringboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.firstspringboot.model.Users;
import com.example.firstspringboot.sevice.imp.UserServiceImp;

@Controller
public class LoginController {
	
	@Autowired
	private UserServiceImp userServiceImp;
	
	@RequestMapping("login")
	public String index(Model model) {	
		return "login";
	}
	
	@PostMapping("doLogin")
	public String doLogin(@ModelAttribute(value = "users") Users user, HttpSession session, RedirectAttributes redirectAttributes) {
		
		Users currentUser = new Users();			
		currentUser =userServiceImp.authentication(user.getUserName(), user.getPassWord());
		if (currentUser == null) {
			redirectAttributes.addFlashAttribute("message", "User not exsist");
			return "redirect:/login";
		}
		session.setAttribute("user", currentUser.getUserName());
		return "redirect:/";
		
	}
	


	
	
}
