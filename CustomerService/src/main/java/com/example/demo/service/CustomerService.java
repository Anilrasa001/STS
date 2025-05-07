package com.example.demo.service;
package com.example.customerservice.service;

import com.example.customerservice.model.Customer;
import com.example.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        return customerRepository.findById(id)
                .map(c -> {
                    c.setName(updatedCustomer.getName());
                    c.setEmail(updatedCustomer.getEmail());
                    c.setAddress(updatedCustomer.getAddress());
                    return customerRepository.save(c);
                })
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));
    }
}