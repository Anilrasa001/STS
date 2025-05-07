package com.example.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Exception.InvalidProductException;
import com.example.demo.Model.Product;
import com.example.demo.Service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {
	private static final String ID2 = "id";
	@Autowired
	ProductService Service;
	@GetMapping("/listall")
	public List<Product> list(){
		return Service.listAllProducts();
	}
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		return Service.addProduct(product);
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public String delproduct(@PathVariable(ID2) int id) {
			
			return Service.delproduct(id);
			
		}
	@PutMapping("updateproduct/{id}/{name}")
	public Product updateproduct(@PathVariable("id") int id,@PathVariable("name") String name) {
		return Service.updateproduct(id,name);
	}
	@GetMapping("getproductbyid/{id}")
	public Product getmethodbyid(@PathVariable ("id") int id) {
		
		return Service.getmethodbyid(id);
	}
//	@PostMapping("/Addmany")
//	
//		public List<Product> Addmany(@RequestBody List<Product> product){
//		
//			return Service.CreateManyProducts;
//		}

//product is not found
@GetMapping("/{id}")
public ResponseEntity<?> getproductbyid(@PathVariable Integer id) {
    try {
        Product product = Service.getproductbyid(id);
        return ResponseEntity.ok(product);
    } 
    catch (InvalidProductException  ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put("error", "Product Not Found");
        errorResponse.put("message", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}
}

