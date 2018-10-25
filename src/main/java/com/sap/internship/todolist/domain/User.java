package com.sap.internship.todolist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(nullable = false, unique = true)
    private String nickName;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    public User() {
		// Default
	}
    
    public User(String nickName, String firstName, String lastName) {
		this.nickName = nickName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    
    public String getFirstName() {
		return firstName;
	}
    
    public String getLastName() {
		return lastName;
	}
}