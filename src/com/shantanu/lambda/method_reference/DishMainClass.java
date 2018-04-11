package com.shantanu.lambda.method_reference;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class DishMainClass {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,8 ,2,2 ,2,2,3,4,5,6,7,8,9,0);
		
		List<Integer> numbers3 = numbers.stream()
		.filter(d->d%2 ==0)
		.distinct().limit(3).collect(toList());
		/*.forEach(System.out::println);*/
		System.out.println(numbers3);
		
		List<String> list = Arrays.asList("JAVA 8" ,"in", "Action" , "Hello" ,"World");
		List<Integer> wordCount = list.stream().map(String::length).collect(toList());
		
		list.stream().map(String::length).collect(toList())
		.forEach(System.out::println);
		System.out.println("Length:   ");
		/*for (Integer integer : wordCount) {
			System.out.println(integer);
		}*/
		
		List<String> uniqueCharacters = list.stream().map(w ->w.split(""))
				.flatMap(Arrays::stream)
				.distinct()
				.collect(toList());
		System.out.println("UniqueCharacters: "+uniqueCharacters);
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		// SQUARE of a NUMBER
		list1.stream().map(p->p*2).collect(toList()).forEach(System.out::print);
		
		List<Integer> num1 = Arrays.asList(9,8,7);
		List<Integer> num2 = Arrays.asList(1,2);
		
		  num1.stream()
				.flatMap(
						i->num2.stream()
						.map(j->new Integer[] {i,j}))
				.collect(toList())
		 .forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));
		
		  int count = Dish.menu.stream()
		  .map(d->1)
		  .reduce(0 , (a,b) -> a+b);
		  long count1 = Dish.menu.stream().count();
		  System.out.println("Number of dish Items: "+count);
		  
		  int calories = Dish.menu.stream()
				  .mapToInt(Dish :: getCalories)
				  .sum();
		  System.out.println("Sum of the calories: "+calories);
	}

}
