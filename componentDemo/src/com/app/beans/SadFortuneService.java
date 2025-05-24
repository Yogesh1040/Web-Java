package com.app.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;

@Component
public class SadFortuneService implements FortuneService{

	public SadFortuneService()
	{
		System.out.println("In SadFortunrServide");
	}
	
	@Override
	public String getFortune()
	{
		return "Sad Fortune !!!!!";
	}
}
