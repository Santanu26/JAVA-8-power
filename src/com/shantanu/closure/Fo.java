package com.shantanu.closure;

@FunctionalInterface
public interface Fo {
	String formatName(String str);
	default void a() {
		System.out.println("This is Simple default method");
	}

}
