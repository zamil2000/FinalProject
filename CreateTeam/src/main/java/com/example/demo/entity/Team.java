package com.example.demo.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class Team {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		private Long teamId;
		private String teamName;
		private double maximumBudget;
		public Team() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Team(Long teamId, String teamName, double maximumBudget) {
			super();
			this.teamId = teamId;
			this.teamName = teamName;
			this.maximumBudget = maximumBudget;
		}
		public Long getTeamId() {
			return teamId;
		}
		public void setTeamId(Long teamId) {
			this.teamId = teamId;
		}
		public String getTeamName() {
			return teamName;
		}
		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}
		public double getMaximumBudget() {
			return maximumBudget;
		}
		public void setMaximumBudget(double maximumBudget) {
			this.maximumBudget = maximumBudget;
		}


}
