package com.sanketnit.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanketnit.blog.entities.Category;
import com.sanketnit.blog.entities.Post;
import com.sanketnit.blog.entities.User;


public interface PostRepo extends JpaRepository<Post, Integer>{
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
}
