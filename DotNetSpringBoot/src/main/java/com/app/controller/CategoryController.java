package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Category;
import com.app.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "*")
public class CategoryController {

	@Autowired
    private CategoryService categorySer;

    @GetMapping
    public List<Category> getAllCategories() {
        return categorySer.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Category> getOneCategories(@PathVariable long id) {
        return categorySer.findById(id);
    }

    @PostMapping
    public Category createCategory(@Valid @RequestBody Category category) {
        return categorySer.save(category);
    }
    
    @PutMapping
    public Category updateCategory(@Valid @RequestBody Category category) {
        return categorySer.save(category);
    }
}
