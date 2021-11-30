package com.javaex.ex04;

public class Employee extends User{
	//field
	public int salary;
	
	//constructor
	public Employee() {}
	
	public Employee(String id, String password, String name,int salary) {
		super(id, password, name);
		this.salary=salary;
	}
	//getter setter

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	//method general

	@Override
	public String toString() {
		return "Employee [salary=" + salary + "]";
	}
	
	public void showInfo() {
		System.out.println("#아이디:"+id+", #패스워드:"+password+", #이름:"+name+", #급여:"+salary);
	}
	
	

	
}
