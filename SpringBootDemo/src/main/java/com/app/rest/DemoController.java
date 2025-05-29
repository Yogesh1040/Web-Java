package com.app.rest;


import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
	public String getLocalTime()
	{
		return "Hello Time is : "+LocalDateTime.now();
	}
}
