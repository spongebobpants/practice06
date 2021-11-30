package com.javaex.ex01;

public class Person {
	
	//field
	protected String name;
	protected String hp;
	
	//constructor
	public Person() {}
	public Person(String name, String hp) {
		this.name=name;
		this.hp=hp;
	}
	//method-g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	//method-general
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + "]";
	}
	
	public void showInfo() {
		System.out.println("#이름: "+name+", #핸드폰:"+hp);
	}
	
	
}
