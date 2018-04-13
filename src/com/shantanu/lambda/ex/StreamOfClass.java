package com.shantanu.lambda.ex;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfClass {
	public static void main(String[] args) {
		int[] nums = { 2,5,3,7,5,4,9,100,0};
		streamToUppercase();
		summationWithStaticMethod(nums);
		print_element_with_method_reference();
		print_element_with_lambda();
		print_element_with_lambda_increase_number();
	}

	private static void summationWithStaticMethod(int[] nums) {
		System.out.println(Arrays.stream(nums).sum());
	}

	private static void print_element_with_method_reference() {
		Stream.of("One" ,"Two" ,"Three").forEach(System.out::println);
	}
	private static void print_element_with_lambda() {
		IntStream.of(2 ,5,4,0,100).forEach(element->System.out.print(element));	
	}
	private static void print_element_with_lambda_increase_number() {
		IntStream.of(1,2,3,0,9).forEach(element->System.out.println(element+1));
	}
	
	
	private static void streamToUppercase() {
		Stream<String> streamOfToUppercase = Stream.of("Shantanu" ,"Test" , "Power Of Stream");
		streamOfToUppercase.map(String:: toUpperCase)
		.forEach(System.out::println);
		
	}

}
