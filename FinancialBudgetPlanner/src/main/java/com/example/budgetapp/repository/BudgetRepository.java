package com.example.budgetapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.budgetapp.model.BudgetModel;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetModel, Integer> {

}