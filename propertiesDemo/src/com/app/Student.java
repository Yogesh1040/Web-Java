package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	private String name;
	
	@Value("SAP")
	private String interestedCourse;
	
	@Value(value = "${student.hobby}")
	private String hooby;
	
	@Value("Yash")
	public void setName(String name)
	{
		this.name = name;
	}

	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}

	public void setHooby(String hooby) {
		this.hooby = hooby;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", interestedCourse=" + interestedCourse + ", hooby=" + hooby + "]";
	}
	
	
}
