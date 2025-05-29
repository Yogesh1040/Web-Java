package com.app.commons;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

	
	
	public TennisCoach() {
		super();
		System.out.println("In Default of Tennis");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Jumpiing Jacks";
	}

}
