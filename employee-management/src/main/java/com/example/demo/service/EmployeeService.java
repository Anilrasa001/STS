package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Service
public class EmployeeService {
    private final List<Employee> employeeList = new ArrayList<>();
    private Long nextId = 1L;

    public String addEmployee(Employee employee) {
        employee.setId(nextId++);
        employeeList.add(employee);
        return "Employee added successfully";
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getEmployeeById(Long id) {
        return employeeList.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with ID: " + id));
    	}


    public String deleteEmployee(Long id) {
        Employee emp = getEmployeeById(id); // will throw if not found
        employeeList.remove(emp);
        return "Employee deleted successfully";
    }
}
