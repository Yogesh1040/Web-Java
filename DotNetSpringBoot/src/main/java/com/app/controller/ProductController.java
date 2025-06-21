package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.model.Product;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
//@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
    private ProductService productRepo;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody Product product) {
        return productRepo.save(product);
    }
}
