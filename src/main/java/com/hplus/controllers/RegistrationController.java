package com.hplus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hplus.beans.User;
import com.hplus.repository.UserRepository;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/registeruser") 	 	
	public String registerUser(@ModelAttribute("newuser")User user,Model model) {
		
		userRepository.save(user);
		
		model.addAttribute("dataSaved","User register successfully.");
		
		
		return "login";
	}
	
	
}
