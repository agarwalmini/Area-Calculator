package com.area.model;

public class Rectangle implements Shape{
	
	private double length;
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	private double breadth;
	
	@Override
	public double area() {
		return getLength() * getBreadth();
	}
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

}
