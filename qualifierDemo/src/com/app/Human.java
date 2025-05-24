package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("octopusHeart")
	 */
	Heart heart;	
	
	public Human() {
		super();
		System.out.println("In Human Constructor");
	}






	/*
	 * @Autowired public Human(@Qualifier("humanHeart") Heart heart) { super();
	 * System.out.println("In Human Para"); this.heart = heart; }
	 */
	
	
	  @Autowired
	  
	  @Qualifier("octopusHeart") public void setHeart(Heart heart) {
	  System.out.println("In Human Setter"); this.heart = heart; }
	 
	
	public void pump()
	{
		if(heart != null)
		{
			heart.pumping();
			System.out.println("Name - "+heart.getNameOfAnimal()+" No Of Hearts - "+heart.getNoOfHearts());
		}
		else
		{
			System.out.println("You are Dead");
		}
	}
}
