package com.sap.internship.todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sap.internship.todolist.domain.User;
import com.sap.internship.todolist.repository.UserRepository;

@SpringBootApplication
public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    /*
     * DB initilization
     */
    @Bean
    public CommandLineRunner initDB(UserRepository userRepository) {
    	return (args) -> {
    		// save a couple of users...
    		userRepository.save(new User("antho", "Anthony", "Muller"));
    	};
    }
}
