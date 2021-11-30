package com.javaex.ex02;

public class Shape {
	//field
	public String fillColor;
	public String lineColor;
	
	//constructor 기본 생성자 
	public Shape() {
		System.out.println("생성자 Shape(0)실행 ");
	}
	
	public Shape(String fillColor, String lineColor){
		this.fillColor=fillColor;
		this.lineColor=lineColor;
		System.out.println("생성자 Shape(2)실행 ");
		
	}

}

