package com.shantanu.lambda.pair;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PairCombination {
	public static void main(String[] args) {
List<Integer>  number1 = Arrays.asList(1,2,3,4,5);
List<Integer> number2 = Arrays.asList(9,8);

	number1.stream()
			.flatMap(i->number2.stream()
		      .map(j->new int[] {i ,j}))
			.collect(toList())
			.forEach(print->System.out.println(print[0] +", "+print[1] ));
	}
}
