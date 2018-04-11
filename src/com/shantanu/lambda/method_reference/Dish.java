package com.shantanu.lambda.method_reference;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dish {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public enum Type {
		MEAT, FISH, OTHER
	}
	
	public static final List<Dish> menu = 
			Arrays.asList( 
					new Dish("Chicken", false, 800, Dish.Type.MEAT),
					new Dish("Beef123", false, 800, Dish.Type.MEAT),
					new Dish("Pork", false, 500, Dish.Type.MEAT),
					new Dish("Sil", false, 800, Dish.Type.FISH),
					new Dish("Beef", false, 900, Dish.Type.MEAT),
					new Dish("Salmon", false, 100, Dish.Type.FISH),
					new Dish("Hilsha", false, 200, Dish.Type.FISH),
					new Dish("Mutton", false, 850, Dish.Type.MEAT)
				);
}
