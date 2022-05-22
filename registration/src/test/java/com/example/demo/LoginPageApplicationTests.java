package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import java.util.List;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepo;

@SpringBootTest
class LoginPageApplicationTests {

	/*
	 * @Test void contextLoads() { }
	 */

	@Autowired
	UserRepo repo;

	@Test
	public void testCreate() {
		User user = new User();
		
		user.setEmailId("test@gmail.com");
		user.setFirstname("mohamed");
		user.setGender("male");
		user.setHobbies("cricket");
		user.setPassword("U18it2043!");
		user.setPhonenumber(123455667L);
		repo.save(user);
		assertThatNoException();
	assertThatNullPointerException();
	}
	
	@Test
	public void readAll() {
		List<User>list=repo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
}
