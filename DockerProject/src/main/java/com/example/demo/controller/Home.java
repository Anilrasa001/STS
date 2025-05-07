package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping
public class Home {
	@GetMapping("/hello")
	public String home() 
	{
		return "hello all welcome to the India.........";
	}
}
