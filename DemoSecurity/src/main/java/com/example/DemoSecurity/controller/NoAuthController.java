package com.example.DemoSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth")

public class NoAuthController {
	
	@GetMapping("/noAuth")
	public String getSecurity()
	{
		return "NO Auth Security";
	}

}
