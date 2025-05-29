package com.app.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class CricketCoach implements Coach {

	@Value("${coach.name}")
	private String name;
	
	@Value("${coach.age}")
	private int age;
	
	
	
	public CricketCoach() {
		super();
		System.out.println("In Default of Cricket");
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Bowling  Name : "+name+" Age : "+age;
	}

}
