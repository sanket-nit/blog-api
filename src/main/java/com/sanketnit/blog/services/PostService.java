package com.sanketnit.blog.services;

import java.util.List;

import com.sanketnit.blog.payloads.PostDto;
import com.sanketnit.blog.payloads.PostResponse;

public interface PostService {
//	create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
//	Update
	PostDto updatePost(PostDto postDto, Integer postId);
	
//	delete
	void deletePost(Integer postId);
	
//	Get all posts
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
//	Get single post
	PostDto getPostById(Integer postId);
	
//	Get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
//	Get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
//	Search Post
	List<PostDto> searchPosts(String keyword);
	
}
