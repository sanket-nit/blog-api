package com.sanketnit.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanketnit.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// We wont expose the entity directly anywhere hence we will use this payload to take the data from user
// It may happen that we just want to take some data and add some additional fields to it

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Username must be minimum of 4 characters")
	private String name;
	
	@Email(message="Email address is not valid")
	private String email;
	
	@NotEmpty()
	@Size(min=3, max=10, message="Password must be min of 3 characters and maximum of 10 characters")
	private String password;
	
	@NotEmpty
	private String about;
	
	private Set<RolesDto> roles = new HashSet<>();
}
