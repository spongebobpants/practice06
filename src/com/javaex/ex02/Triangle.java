package com.javaex.ex02;

public class Triangle extends Shape{
	public int width;
	public int height;
	
	public Triangle() {
		System.out.println("생성자 Triange(0)실행 ");
	}
	
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width=width;
		this.height=height;
		System.out.println("생성자 Triange(2) 실행 ");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width=width;
		this.height=height;
		System.out.println("생성자 Triang(4) 실행");
	}
	
}


