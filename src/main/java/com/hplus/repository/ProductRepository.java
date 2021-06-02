/**
 * 
 */
package com.hplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hplus.beans.Product;

/**
 * @author Virupaksha Tippa
 *	01-Jun-2021
 */

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	@Query(value="select * from Product p where p.name like %:name% ",nativeQuery = true)
	public List<Product> searchByName(@Param("name") String name);
	
}
