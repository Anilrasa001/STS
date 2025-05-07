package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@GetMapping("login")
	public String welcome() {
		return "<h1>log in cheyye em chustunnav gorre</h1>";
	}
	
}
