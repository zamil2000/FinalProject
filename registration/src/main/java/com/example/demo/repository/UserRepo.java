package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

	public User findUserByEmailId(String emailId);

	public User findUserByEmailIdAndPassword(String emailId, String password);
	

	
}
