package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;


@Component("cricket")
@Scope("prototype")
public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("In CricketCoach");
	}
	
	@Autowired
	public CricketCoach(@Qualifier("sadFortuneService") FortuneService fortuneService)
	{
		System.out.println("In CricketCoach Para");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Bowling";
	}

	@Override
	public String getFortuneService() {
	
		return fortuneService.getFortune();
	}
	
	
	
}
