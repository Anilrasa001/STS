package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {
	@GetMapping("/root")
	public String meth()
	{
		return"<h1><i>welocme to the rest parameter in spring boot <i><h1>";
	}
}
