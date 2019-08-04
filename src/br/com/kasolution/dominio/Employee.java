package br.com.kasolution.dominio;

import java.text.NumberFormat;

public abstract class Employee {
	
	//encapsulamento
	private int id;
	private String name;
	private String ssn;
	private double salary;
	
	//construtor padrão
		
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Employee(int id, String name, String ssn, double salary) {
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	//gets e sets
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract String getCargo();
	
	//metodo toString
	
	@Override
	public String toString() {
		
		String info = "Cargo: " + getCargo();
		info +=	"\n#ID: " + id;
		info +=	"\nName: " + name;
		info += "\nSocial Security Number: " + ssn;
		info += "\nSalary: " + NumberFormat.getCurrencyInstance().format(salary);
				
		return info ;
	}
	
}
