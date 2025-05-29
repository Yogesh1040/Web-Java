package com.app.commons;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	
	
	public BaseballCoach() {
		super();
		System.out.println("In Default of Baseball");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Sprint";
	}

}
