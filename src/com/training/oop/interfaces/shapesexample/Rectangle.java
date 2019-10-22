package com.training.oop.interfaces.shapesexample;

public class Rectangle implements Shape {

	@Override
	public void drawShape() {
		System.out.println("I am rectangle");
	}

	@Override
	public String getShape() {
		return "I am rectangle";
	}

}
