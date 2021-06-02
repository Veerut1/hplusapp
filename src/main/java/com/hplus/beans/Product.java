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
@Data
public class Product {
	
	@Id
	private int id;
	private String name;
	private String imagePath;
	
}
