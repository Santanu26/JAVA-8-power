package com.shantanu.multipleInheritance;

public interface A {
	default void defaultMethod() {
		System.out.println(this.getClass().toString());
	}

}
