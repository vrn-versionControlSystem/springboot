package com;

import org.springframework.context.ApplicationContext;

import com.entity.User;
import com.repo.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot112024Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Springboot112024Application.class, args);
	
		UserRepository ur=context.getBean(UserRepository.class);
		
		User u=new User();
		u.setCity("Pune");
		u.setName("Karim");
		
		User uu=ur.save(u);
	
		System.out.println("Given Data is:"+uu);
		
		
		
	}

}
