package com.javaex.ex01;

public class Customer extends Person{
	//field
	private int cNo;
	private int point;
	
	//editor
	public Customer() {
		
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}

	
	//method g/s
	
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

	
	//method normal
	
	@Override
	public String toString() {
		return "Customer [cNo=" + cNo + ", point=" + point + ", getcNo()=" + getcNo() + ", getPoint()=" + getPoint()
		+ "]";
	}
	
	public void showInfo() {
		System.out.println("#이름:" + super.getName() + ", #핸드폰:" + super.getHp() + ", #고객번호:" + cNo + ", #포인트점수:" + point);
	}
	
}
