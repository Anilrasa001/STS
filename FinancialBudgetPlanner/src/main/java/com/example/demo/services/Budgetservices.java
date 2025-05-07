package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.budgetapp.model.BudgetModel;
import com.example.budgetapp.repository.BudgetRepository;	
	
@Service		
public class Budgetservices {
	
	@Autowired	
    BudgetRepository budgetrepository;
		
	public List<BudgetModel> listAll() {
		return budgetrepository.findAll();
	}
}
