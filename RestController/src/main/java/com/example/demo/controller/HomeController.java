package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/deva")
public class HomeController {
	@GetMapping("/hello")
	public String welcome() {
		return "<h1>hello anil rasa welcome to spring  rest framework<h1>";
	}
//	@GetMapping("hello/{name}")
//		public String welcome1(@PathVariable("name")String name1) {
//		 return ("hello"+name1);
//		
//		
//			
//		}
	
	
//	@GetMapping("hello/{name}/{quantity}")
//	public String sayhello1(@PathVariable("name") String name1,@PathVariable("quantity") int q)
//	{
//		return ("<h1>hello"+name1+"you got"+q +"points");
//		
//	}
//	
	
	 @GetMapping("/product")
	    public String getProductDetails(@RequestParam String name, 
	                                    @RequestParam(required = false, defaultValue = "1") int quantity) {
	        return "Product: " + name + ", Quantity: " + quantity;
	    }

}

 