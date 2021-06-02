/**
 * 
 */
package com.hplus.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hplus.beans.Product;
import com.hplus.repository.ProductRepository;

/**
 * @author Virupaksha Tippa
 *	01-Jun-2021
 */

@Controller
public class SearchController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/search")
	public String search(@RequestParam("search") String search,Model model) {
		
		List<Product> products = new ArrayList<>();
		
		products = productRepository.searchByName(search);
		model.addAllAttributes(products);
		
		return "search";
	}
	
	
	
	
}
