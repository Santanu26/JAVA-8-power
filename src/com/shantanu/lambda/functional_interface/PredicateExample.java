package com.shantanu.lambda.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static <T> List<T> test(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T t : list) {
			if (predicate.test(t))
				result.add(t);
		}
		return result;
	}
}
