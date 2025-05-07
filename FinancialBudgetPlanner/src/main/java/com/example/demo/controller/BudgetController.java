package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.budgetapp.model.BudgetModel;
import com.example.demo.services.Budgetservices;

@RestController
@RequestMapping("/budgets")
public class BudgetController {
    @Autowired
    public Budgetservices service;
    // Endpoint to get all budget data
    @GetMapping("/getall")
    public List<BudgetModel> list() {
        return service.listAll();
    }
//    @PostMapping("/add")
//    public String addbudgets(@RequestBody BudgetModel budgets ){
//    	return service.addbudgets(budgets);
//    }
//    @PutMapping("/{id}/{category}/{month}/{amount}")
//    public List<BudgetModel> updateBudget(@PathVariable("id") int id,@PathVariable ("category") String category,@PathVariable("month") String month,@PathVariable ("amount") double amount) {
//    	return (List<BudgetModel>) service.updateBudget(id,category,month,amount);
//    }
//    
   
}	


    
//    @GetMapping("/{id}")
//    public BudgetModel getBudgetById(@PathVariable int id) {
//        for (BudgetModel budget : budgets) {
//            if (budget.getId() == id) {
//                return budget;
//            }
//        }
//        return null;  
//    }
//    @PostMapping("/post")
//    public ResponseEntity<BudgetModel> createBudget(@RequestBody BudgetModel budget) {
//        budgets.add(budget);  
//        return ResponseEntity.status(201).body(budget);  
//        }
//    @PutMapping("/{id}")
//    public ResponseEntity<BudgetModel> updateBudget(@PathVariable int id, @RequestBody BudgetModel updatedBudget) {
//        for (BudgetModel budget : budgets) {
//            if (budget.getId() == id) {
//                budget.setCategory(updatedBudget.getCategory());
//                budget.setMonth(updatedBudget.getMonth());
//                budget.setAmount(updatedBudget.getAmount());
//                return ResponseEntity.ok(budget);  
//            }
//        }
//        return ResponseEntity.notFound().build();  
//    }
//    
//}

