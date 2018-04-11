package com.shantanu.lambda.design_pattern.strategy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Computation {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sum = numbers.stream().reduce(0,Integer::sum);
		System.out.println(sum);
		Optional<Integer> sum2 = numbers.stream().reduce((a,b) -> a+b);
		System.out.println(sum2);
		
		int count = numbers.stream()
				.map(d ->1)
				.reduce(0,(a,b)-> a+b);
		System.out.println("Sum: "+count);
	}
}