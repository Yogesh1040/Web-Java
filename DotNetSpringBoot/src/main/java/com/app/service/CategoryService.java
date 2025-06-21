package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Category;

import com.app.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository cRepository;
	
	public List<Category> findAll()
	{
		return cRepository.findAll();
	}
	
	public Optional<Category> findById(long id)
	{
		return cRepository.findById(id);
	}
	
	public Category save(Category category)
	{
	
		return cRepository.save(category);
	}
	
	
}
