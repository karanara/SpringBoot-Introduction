package com.practice1.springboot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//injecting properties from application.properties(coach and team name)
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;

	//exposing teaminfo
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "CoachName  "+ coachName + " , teamName  " + teamName;
	}
	@GetMapping("/")
	public String sayHello() {
		return "HelloWorld";
	}
	@GetMapping("/workout")
	public String getWorkout() {
		return "Workout is going off";
	}
}
