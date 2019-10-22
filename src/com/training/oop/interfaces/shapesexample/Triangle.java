package com.training.oop.interfaces.shapesexample;

public class Triangle implements Shape{

	@Override
	public void drawShape() {
		System.out.println("I am Triangle");
	}

	@Override
	public String getShape() {
		return "I am Triangle";
	}
  
}
