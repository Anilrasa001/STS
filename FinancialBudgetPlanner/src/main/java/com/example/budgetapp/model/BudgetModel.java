package com.example.budgetapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Budget")
public class BudgetModel {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String category;
private String month;
private double amount;
public BudgetModel(int id, String category, String month, double amount) {
	
	super();
	this.id = id;
	this.category = category;
	this.month = month;
	this.amount = amount;
}
public  BudgetModel() {	
					}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "BasicRestApiApplication [id=" + id + ", category=" + category + ", month=" + month + ", amount=" + amount
			+ "]";
}
	
	}




