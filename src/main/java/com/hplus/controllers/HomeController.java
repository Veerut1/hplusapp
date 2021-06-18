/**
 * 
 */
package com.hplus.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.hplus.beans.User;

/**
 * @author Virupaksha Tippa
 *	01-Jun-2021
 */

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homePage() {
		
		return "index";
	}
	
	@GetMapping("/goToSearch")
	public String goToSearch() {
		
		return "search";
	}
	
	@GetMapping("/goToLogin")
	public String goToLogin() {
		
		return "login";
	}
	
	@GetMapping("/goToRegistration")
	public String goToRegistration() {
		
		return "register";
	}
	
	@ModelAttribute("newuser")
	public User getDefaultUser() {
		return new User();
	}
	
	@ModelAttribute("genderItems")
	public List<String> getGenderItems(){
		
		return Arrays.asList("Male","Female","other");
		
	}
	
}
