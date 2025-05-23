package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	//@Autowired
	Heart heart;
	
	public Human()
	{}
	
	//@Autowired
	public Human(Heart heart)
	{
		this.heart = heart;
	}
	
	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void pump()
	{
		if(heart != null)
		heart.pumping();
		else
			System.out.println("You are Dead !!!!");
	}
}
