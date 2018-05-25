package com.shantanu.lambda.uniqueCharacterByUsingFlatMap;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class FlatMapImplementation {
	public static void main(String[] args) {
		
		List<String> normalString = Arrays.asList("Hello" , "World");
		normalString.stream().flatMap(
				(String line) -> Arrays.stream(line.split("")))
				.distinct()
				.forEach(System.out::print);
		
		List<String> uniqueCharacters = 
				normalString.stream()
				.map(w->w.split(""))
				.flatMap(Arrays::stream)
				.distinct().collect(toList());
		
		System.out.println(uniqueCharacters);		
	}
}
