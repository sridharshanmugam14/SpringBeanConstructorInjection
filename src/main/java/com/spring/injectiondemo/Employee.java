package com.spring.injectiondemo;

@SuppressWarnings("unused")
public class Employee{
	
	private int id;
	private String employeeName;
	
	/*Employee(int id, String employeeName) {
		this.id = id;
		this.employeeName = employeeName;
	}*/
	
	
	public void show() {
		System.out.println("ID : "+id+" EmployeeName : "+employeeName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}
