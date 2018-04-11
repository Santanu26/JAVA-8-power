package com.shantanu.lambda.functional_interface;

@FunctionalInterface
public interface PredicateInterface<T> {
	boolean test(T t);

}
