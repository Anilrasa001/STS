package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Exception.InvalidProductException;
import com.example.demo.Model.Product;

@Service
public class ProductService {
    
    private static List<Product> data = new ArrayList();
     
    static {
        data.add(new Product(1, "iPhone X", 999.99f));
        data.add(new Product(2, "XBOX 360", 329.50f));     
    }
     
    public ProductService() {
         
    }
     
  
     
    public List<Product> listAllProducts() {
        
    	return data;
    }
    public String addProduct(Product product) {
    	data.add(product);
    	return "add data successfully";
    	
    }



	public String delproduct(int id) {
		// TODO Auto-generated method stub
		for (Product p:data) {
			if( p.getId()==id) {
				data.remove(p);
			}
			
		}
		
		return "delelte successfully...";
	}
 
	public Product updateproduct(int id, String name) {
		Product p1 = null;
		// TODO Auto-generated method stub
		for (Product p:data) {
			
			if (p.getId()==id) {
					p.setName(name);
					p1=p;
			
			}
		}
	
	return p1;
}



	public Product getmethodbyid(int id) {
		for (Product p:data)
		{
			if(p.getId()==id)
			{
				return p;
			}
		}
		return null;
	}



	public Product getproductbyid(Integer id) throws InvalidProductException {
		for (Product product : data) {
	        if (product.getId()==(id)) { // Using equals() for Integer comparison
	            return product;
	        }
	    }
	    throw new InvalidProductException("Product with ID " + id + " not found");

	}







	
}