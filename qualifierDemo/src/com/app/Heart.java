package com.app;

public class Heart {

	private String nameOfAnimal;
	private int noOfHearts;
	
	public Heart() {
		super();
	}
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	
	public int getNoOfHearts() {
		return noOfHearts;
	}
	
	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}
	
	public void pumping()
	{
		System.out.println("Your Heart is Pumping");
		System.out.println("You are Alive !!!");
	}
	
}
