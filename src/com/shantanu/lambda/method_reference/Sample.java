package com.shantanu.lambda.method_reference;
import static java.util.stream.Collectors.toList;

import java.util.List;
public class Sample {
	public static void main(String[] args) {
		List<String> names = Dish.menu.stream()
			.filter(d -> {
			         System.out.println("Filtering: " + d.getName());
			         return d.getCalories() > 500;
		}).map(d -> {
					System.out.println("Mapping: " + d.getName()+ d.getCalories());
					return d.getName();
		}).limit(4).collect(toList());
		System.out.println(names);
		
		Dish.menu.stream().forEach(System.out::print);
		
		Dish.menu.stream()
		.filter(d ->d.getType() == Dish.Type.MEAT)
		.limit(2)
		.collect(toList()).forEach(System.out::println);
		

	}

}
