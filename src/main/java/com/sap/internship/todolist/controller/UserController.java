package com.sap.internship.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sap.internship.todolist.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private UserService service;
	
	@Autowired
	public UserController(UserService service) {
		this.service = service;
	}
	
	@GetMapping("/{nickName}")
	public String greeting(@PathVariable String nickName) {
		return this.service.greeting(nickName);
	}
}
