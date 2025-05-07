package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
	@GetMapping("/hello")
	public String home() 
	{
		return "hello all welcome to the India.........";
	}

}



