package com.shantanu.closure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		///Runnable r = () -> System.out.println("Runnable Interface");
		System.out.println(isPrime(11));
		int[] a= {1,10,11,19};
		List<Integer> listInt = new ArrayList<Integer>();
		for (Integer a1 : a) {
			listInt.add(a1.intValue());	
		}
		//sumWithCondition(listInt);
	}
public static boolean isPrime(int n) {
	IntPredicate isDivisible = index -> n % index ==0;
	
	return n >1 &&
			IntStream.range(2 ,  n)
			.noneMatch(isDivisible);
}

public static int sumWithCondition(List<Integer> n , Predicate<Integer> predicate) {
	return n.parallelStream()
			.filter(predicate)
			.mapToInt(i->i)
			.sum();
}
}
