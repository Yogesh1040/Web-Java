package com.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Product;
import com.app.service.ProductService;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	/*
	 * @Procedure(name = "Product.getAllProducts") List<Product>
	 * getAllUsingProcedure();
	 */

	
}
