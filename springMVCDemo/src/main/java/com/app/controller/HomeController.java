package com.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api")
public class HomeController {

	@RequestMapping("/login")
	public String helloWorld()
	{
		return "login";
	}
	
	@RequestMapping("/welcome")
	public String welcomePage(HttpServletRequest request, Model model)
	{
		String user = request.getParameter("txtUsername");
		user = user.toUpperCase();
		model.addAttribute("uname", user);
		return "student-confirmation";
	}
}
