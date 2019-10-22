package com.training.oop.interfaces.shapesexample;

public class ShapeDriver {

	public static void main(String[] args) {
		Shape shape = new Triangle();
		shape.drawShape();
		shape = new Rectangle();
		shape.drawShape();
	}

}
