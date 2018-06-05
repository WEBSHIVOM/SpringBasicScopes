package com.inno.model;

public class CustomerService {
	String message;
     
	public CustomerService(int salaryEmp) {
		System.out.println("salary ="+salaryEmp);
	}
	int salary;
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void initIt() throws Exception {
		  System.out.println("Init method after properties are set : " + message);
		}

		public void cleanUp() throws Exception {
		  System.out.println("Spring Container is destroy! Customer clean up");
		}
}
