package com.scm.wahaj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SCMController {
	
	@RequestMapping("/home")
	public String hello() {
		System.out.println("Hello Mr Wahaj");
		return "home";
	}
	
	

}
