package com.shantanu.multipleInheritance;

public class D implements C , B{
	@Override
	public void defaultMethod() {
           B.super.defaultMethod();		
	}

}
