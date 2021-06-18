/**
 * 
 */
package com.hplus.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Virupaksha Tippa
 *	01-Jun-2021
 */

@Entity

public class Product {
	
	@Id
	private int id;
	private String name;
	private String imagePath;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	
	
}
