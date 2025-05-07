package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SecurityDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityDemoConsumerApplication.class, args);

		// Step 1: Create headers safely
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("anil", "7032"); // Set basic auth (username, password)

		// Step 2: Create request entity
		HttpEntity<String> reqEntity = new HttpEntity<>(headers);

		// Step 3: Define API URL
		String apiURL = "http://localhost:8000/msg";

		// Step 4: Create RestTemplate and make the call
		RestTemplate restTemplate = new RestTemplate();
		try {
			ResponseEntity<String> resEntity = restTemplate.exchange(
				apiURL,
				HttpMethod.GET,
				reqEntity,
				String.class
			);

			// Step 5: Print response
			System.out.println("Response from secured API: " + resEntity.getBody());

		} catch (Exception e) {
			System.err.println("Error calling secured API: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
