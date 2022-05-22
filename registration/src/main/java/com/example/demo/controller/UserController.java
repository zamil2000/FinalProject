package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.RegistrationService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired
	private RegistrationService service;
	
	@PostMapping("/register")
	@CrossOrigin(origins = "*")
	public User registerForm(@RequestBody User user)  throws Exception{
		
		
			String emailid=user.getEmailId();
			
			if(emailid != null && !"".equals(emailid)) {
				
				User userObj=service.fetchByEmail(emailid);
				if(userObj != null){
					throw new Exception("User with "+emailid+" is already exsits");
				}
			}
			
			User userObj=null;
			userObj = service.saveMethod(user);
			return userObj;
			
		}
	
	   @PostMapping("/login")
	   @CrossOrigin(origins = "*")
		public User login(@RequestBody User user) throws Exception {
			
			String tempemail=user.getEmailId();
			String temppassowrd=user.getPassword();
			
			User userobj=null;
			if(tempemail !=null && temppassowrd !=null) {
				userobj=service.fetchByEmailAndPassword(tempemail, temppassowrd);
			}
			
			if(userobj==null) {
				throw new Exception("Bad credntials");
			}
			
			return userobj;
		}
	
	
	
	}
	
	

