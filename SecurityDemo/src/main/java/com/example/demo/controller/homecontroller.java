package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {
	@GetMapping("/msg")
	public String Sayhello() {
		return "weclcome to java";
	}
	@GetMapping("/    ")
	public String Hello() {
		return "weclcome tO CONTACT PAGE";
	}

	
}
