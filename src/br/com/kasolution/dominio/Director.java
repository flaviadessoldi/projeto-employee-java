package br.com.kasolution.dominio;

import java.text.NumberFormat;

public class Director extends Manager{
	private double budget;
	
	public Director() {
		
	}
		
	public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
		super(id, name, ssn, salary, deptName);
		this.budget = budget;
				
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	@Override
	public String toString() {
		String info = super.toString();
		info += "\nBudget: " + NumberFormat.getCurrencyInstance().format(budget);
		
		return info;
	}
	
	
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Director";
	}
}
