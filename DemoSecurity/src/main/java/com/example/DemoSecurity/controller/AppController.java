package com.example.DemoSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/basicAuth")
	public String getSecurity()
	{
		return "Hello Security";
	}

}
