package com.inno.model;

public class salaryEmp {

	int salary;
	public salaryEmp(int sal) {
		this.salary=10000;
	}
	public int getSalary() {
		return salary;
	}
	public void initsalary() throws Exception {
		  System.out.println("Init method after properties are set : " + salary);
		}
	public salaryEmp() {
		super();
	}
}
