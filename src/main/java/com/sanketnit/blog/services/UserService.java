package com.sanketnit.blog.services;

import com.sanketnit.blog.entities.User;
import com.sanketnit.blog.payloads.UserDto;
import java.util.List;

public interface UserService {
	UserDto registerNewUser(UserDto userDto);
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer id);
	UserDto getUserById(Integer id);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
