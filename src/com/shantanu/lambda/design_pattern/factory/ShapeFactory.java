package com.shantanu.lambda.design_pattern.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		Shape shape = null;
		if (shapeType == null)
			return null;
		else {
			// @formatter:off
			switch (shapeType) {
			case "Circle":
				shape= new Circle();break;
			case "Rectangle":
				shape= new Rectangle();
				break;
			default:
				;
			}// @formatter:on
		}
		return shape;
	}

}
