package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Team;
import com.example.demo.repository.TeamRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	TeamRepository repo;
	
	@Test
	void contextLoads() {
	}

	@Test
	public void createTeam() {
		Team team = new Team();
		team.setMaximumBudget(100);
		team.setTeamName("prk");
		repo.save(team);
		assertThatNoException();
		assertThatNullPointerException();
}
	@Test
	public void readAll() {
		List<Team>list=repo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
}