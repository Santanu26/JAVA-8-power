package com.shantanu.lambda.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {
	public static void main(String[] args) {
		Stream.iterate(0, n->n+2)
		.limit(10)
		.forEach(System.out::println);
		// 0 2 4 8......
		
		fibonacci_series_with_stream_iterate();
		test();
		
		IntStream generate = IntStream.generate(()->1);
		System.out.println(generate);
	}
	private static void test() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.stream().map(n -> n / 0)
		.filter(n -> n % 2 == 0);
		
		System.out.println("List: "+list);
	}
	private static void fibonacci_series_with_stream_iterate() {
		/*Stream.iterate(new int[] {1, 1} , t->new int[] {t[1] , t[0]+t[1]})
		.limit(20)
		.forEach(t->System.out.println("("+t[0]+","+t[1]+")"));*/
		
		Stream.iterate(new int[] {0, 1} , t->new int[] {t[1] , t[0]+t[1]})
		.map(t->t[0]).limit(10)
		.forEach(System.out::println);
	}
}
