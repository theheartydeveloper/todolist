package com.sap.internship.todolist.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sap.internship.todolist.domain.User;
import com.sap.internship.todolist.repository.UserRepository;

@Service
public class UserService {

	private UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public String greeting(String nickName) {
		Optional<User> user = repository.findByNickName(nickName);
		if(user.isPresent())
		{
			return "Hello " + user.get().getFirstName() + " " + user.get().getLastName()  + "!";	
		}
		return "Unknown user!?";
	}
}
