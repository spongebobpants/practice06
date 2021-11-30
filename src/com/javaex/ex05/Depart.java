package com.javaex.ex05;

public class Depart extends Employee{
	//field
	public String depart;
	public String name;
	public int salary;
	
	//constructor

	
	public Depart() {}
	public Depart(String name, int salary, String depart) {
		this.name=name;
		this.salary=salary;
		this.depart=depart;
	}
	
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Depart [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
	}
	public void showInformation() {
		System.out.println("이름:"+name+" 연봉:"+salary+" 부서:"+depart);
	}
	
	
}
