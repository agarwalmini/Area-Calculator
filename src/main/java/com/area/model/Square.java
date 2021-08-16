package com.area.model;

public class Square implements Shape{
	
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return Math.pow(getSide(), 2);
	}

	public Square(double side) {
		super();
		this.side = side;
	}
}
