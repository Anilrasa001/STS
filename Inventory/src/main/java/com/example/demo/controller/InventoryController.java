package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
	 @Autowired
	    private RestTemplate restTemplate;

	    @GetMapping("/check/{productId}")
	    public ResponseEntity<String> checkStock(@PathVariable String productId) {
	        // Fetch product details from Product Service
	        String productDetails = restTemplate.getForObject("http://PRODUCT/products/" + productId, String.class);
	        return ResponseEntity.ok("Stock available for: " + productDetails);
	    }

}
