package com.app.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class HappyFortuneService implements FortuneService{

	public HappyFortuneService()
	{
		System.out.println("In SadFortunrServide");
	}
	
	@Override
	public String getFortune()
	{
		return "Happy Fortune !!!!!";
	}
}
