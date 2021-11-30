package com.javaex.ex01;

public class Customer extends Person{
	
	//field
	public int cNo;
	public int point;

	//cons
	public Customer() {
		//super();
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name,hp);
		this.cNo=cNo;
		this.point=point;//본인 인스턴스
	}
	//method-g/s
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	//method general
	
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + "]";
	}
	
	public void showInfo() {
//		System.out.println("#이름: "+name+", #핸드폰:"+hp);
		System.out.println("#이름: "+name+", #핸드폰:"+hp+", #고객번호:"+cNo+", #포인트점수:"+point);
	}
	
	

	
}
