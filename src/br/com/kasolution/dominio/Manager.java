package br.com.kasolution.dominio;

public class Manager extends Employee {
	private String deptName;

	public Manager() {
		
	}
		
	public Manager(int id, String name, String ssn, double salary, String deptName) {
		super(id, name, ssn, salary);
		this.deptName = deptName;
		
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		String info = super.toString();
		info += "\nDept. Name: " + deptName;
		
		return info;
	}
	
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Manager";
	}
		
}
