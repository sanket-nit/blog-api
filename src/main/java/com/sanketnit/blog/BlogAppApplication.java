package com.sanketnit.blog;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sanketnit.blog.config.AppConstants;
import com.sanketnit.blog.entities.Role;
import com.sanketnit.blog.repositories.RoleRepo;

@SpringBootApplication
public class BlogAppApplication implements CommandLineRunner{

	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BlogAppApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(this.passwordEncoder.encode("12345"));
//		try {
//			Role role1 = new Role();
//			role1.setId(AppConstants.ADMIN_USER);
//			role1.setName("ADMIN_USER");
//			
//			Role role2 = new Role();
//			role2.setId(AppConstants.NORMAL_USER);
//			role2.setName("NORMAL_USER");
//			
//			List<Role> roles = List.of(role1, role2);
//			List<Role> result = this.roleRepo.saveAll(roles);
//			result.forEach(r-> {
//				System.out.println(r.getName());
//			});
//			
//		} catch (Exception e) {
//			
//		}
	}

}
