package com.sanketnit.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanketnit.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{
	
}
