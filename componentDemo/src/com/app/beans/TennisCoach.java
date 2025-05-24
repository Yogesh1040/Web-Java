package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;


@Component

public class TennisCoach implements Coach{

	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("In TennisCoach");
	}
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService)
	{
		System.out.println("In TennisCoach Para");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run 5Km ";
	}

	@Override
	public String getFortuneService() {
	
		return fortuneService.getFortune();
	}
	
	
	
}
