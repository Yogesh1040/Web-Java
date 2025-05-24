package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	//@RequestMapping(path = "/", method = RequestMethod.GET)
	@RequestMapping("/")
	public String helloWorld()
	{
		return "index";
	}
	
	
}
