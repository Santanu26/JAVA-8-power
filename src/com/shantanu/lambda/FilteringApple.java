package com.shantanu.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toList;

public class FilteringApple {
	public static void main(String... args) {
		List<Apple> inventory = Arrays.asList(
				new Apple(170, "green"), 
				new Apple(160, "red"), 
				new Apple(190, "green"),
				new Apple(80, "green"));
		print(inventory);
		
		List<Apple> parallelProcess = inventory.parallelStream()
										.filter((Apple apple) ->apple.getWeight() >150)
										.filter((Apple apple) -> apple.getColor().equals("green"))
										.collect(toList());
		System.out.println("AND the Last ONE : "+parallelProcess);
		
		List<Apple> normalSingleProcess = inventory
				.stream()
				.filter((Apple apple) -> apple.getWeight()>150)
				.collect(toList());
		
		System.out.println("NORMAL : "+ normalSingleProcess);

	}

	public static void print(List<Apple> inventory) {
		List<Apple> smallApples = filterApples(inventory,
				(Apple a) -> a.getWeight() < 80 && "brown".equals(a.getColor()));
		System.out.println("SMALL APPLE: " + smallApples);
		List<Apple> weirdApples1 = filterApples(inventory, FilteringApple::isHeavyWeightApple);
		System.out.println("BIG Apple: " + weirdApples1);
		List<Apple> weirdApples2 = filterApples(inventory, FilteringApple::isGreenApple);
		System.out.println("GREEN APPLE: " + weirdApples2);
		List<Apple> bigApple = filterApples(inventory, (Apple apple) -> apple.getWeight() > 150);
		System.out.println("ANOTHER BIG APPLE: " + bigApple);
	}

	public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	private static boolean isHeavyWeightApple(Apple apple) {
		return apple.getWeight() > 150;
	}

	private static boolean isGreenApple(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
