package br.com.kasolution.teste;

import br.com.kasolution.dominio.Admin;
import br.com.kasolution.dominio.Director;
import br.com.kasolution.dominio.Employee;
import br.com.kasolution.dominio.Engeneer;
import br.com.kasolution.dominio.Manager;

public class TesteEmployee {

	public static void main(String[] args) {
		
		//instanciando um novo employee
		
		Employee engeneer = new Engeneer(101, "Jane Smith", "012-34-5678", 120_345.27);
		Employee manager = new Manager(207, "Barbara Johnson", "054-12-2367", 109_501.27,"US Marketing");
		Employee admin = new Admin(304, "Bill Munroe", "108-23-6509", 75_007.34);
		Employee director = new Director(12, "Susan Wheeler", "099-45-2340", 120_567.36,"Global Marketing", 1_000_000.00);
		
				
		//imprimindo um employee
		Employee employees[]= {engeneer, manager, admin, director};
		for (Employee e : employees) {
			System.out.println(e + "\n");
		}
		
	}// fim main

}//fim classe
