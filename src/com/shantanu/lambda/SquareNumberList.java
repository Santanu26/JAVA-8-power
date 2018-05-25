package com.shantanu.lambda;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class SquareNumberList {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		nums.stream()
		.filter(n-> {
			System.out.println("Filtering: "+n);
			return n%2 ==0;
		})
		.map(n-> {
			System.out.println("Square the Even numbers: "+n);
			return n*n;
		})
		.collect(toList());
	}

}
