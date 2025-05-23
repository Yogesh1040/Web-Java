package com.app;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Vodafone");		
	}

	@Override
	public void data() {
		System.out.println("Browsing using Vodafone");		
	}

}
