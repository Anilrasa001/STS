package com.example.demo.controller;
//@controller
//public class HomeController {
//
//}
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/Hi")
	public  String sayHello()
	{
		
		return "index";
	}
}