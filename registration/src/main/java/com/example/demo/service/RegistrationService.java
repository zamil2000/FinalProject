package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@Service
public class RegistrationService {

	@Autowired
	private UserRepo repo;
	
	public User saveMethod(User user) {
		
		return repo.save(user);
	}
	
	public User fetchByEmail(String email) {
		
		return repo.findUserByEmailId(email);
	}
	
public User fetchByEmailAndPassword(String email,String password) {
		
		return repo.findUserByEmailIdAndPassword(email,password);
	}
}
