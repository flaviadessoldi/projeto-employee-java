package br.com.kasolution.dominio;

public class Admin extends Employee {

	public Admin() {
		
	}
	
	public Admin (int id, String name, String ssn, double salary) {
		super(id, name, ssn, salary);
	}
	
	
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Admin";
	}
}
