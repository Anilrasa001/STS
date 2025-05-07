package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ordercontroller {
	@Autowired 
	RestTemplate restTemplate;
	@GetMapping("/order")
	public ResponseEntity<String> getOrder(){
//		String resoponse=restTemplate.getForObject("http://localhost:8099/item",String.class);
		String resoponse =restTemplate.getForObject("http://ITEM-SERVICE/item",String.class);
		return new ResponseEntity<String>(resoponse,HttpStatus.OK);
	}

}
