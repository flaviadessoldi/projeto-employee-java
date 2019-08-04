package br.com.kasolution.dominio;

public class Engeneer extends Employee {
	
	public Engeneer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Engeneer(int id, String name, String ssn, double salary) {
		super(id, name, ssn, salary);
		
	}
	
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Engineer";
	}
	
	
	
	
}
