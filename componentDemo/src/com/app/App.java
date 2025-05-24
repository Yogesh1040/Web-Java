package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.utility.Coach;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach coach2 = context.getBean("cricket",Coach.class);
		boolean status = (coach == coach2);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
		
		System.out.println("Status - "+status);
	}
}

