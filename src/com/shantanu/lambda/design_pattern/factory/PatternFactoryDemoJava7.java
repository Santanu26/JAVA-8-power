package com.shantanu.lambda.design_pattern.factory;

public class PatternFactoryDemoJava7 {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circleShape = factory.getShape("Circle");
		circleShape.show();
		
		Shape rectangleShape = factory.getShape("Rectangle");
		rectangleShape.show();
		
	}

}
