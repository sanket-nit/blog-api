package com.sanketnit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanketnit.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
