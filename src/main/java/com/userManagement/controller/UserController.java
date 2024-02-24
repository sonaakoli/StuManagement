package com.userManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.userManagement.model.User;



@Controller
public class UserController {
	@GetMapping("/user")
	public String loadUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userinfo";

	}
}
