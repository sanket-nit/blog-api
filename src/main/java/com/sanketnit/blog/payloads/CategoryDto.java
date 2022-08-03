package com.sanketnit.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CategoryDto {
	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, message="Minimum size of category title must be of 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, message="Minimum size of category description must be of 10")
	private String categoryDescription;
}
