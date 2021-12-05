package com.javaex.ex03;

public class Shape {
	//field
	public String fillColor;
	public String lineColor;
	
	//constructor
	public Shape() {}
	public Shape(String fillColor, String lineColor){
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	
	//getter/setter
	public void setFillColor(String fillColor) {
		this.fillColor=fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor=lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}

	//toString
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	
	
	
	
}

