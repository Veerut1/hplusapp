/**
 * 
 */
package com.hplus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	
}
