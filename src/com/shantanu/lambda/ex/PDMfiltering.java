package com.shantanu.lambda.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PDMfiltering {
	public static void main(String[] args) {
		List<Person> filterPerson = Arrays.asList(new Person("Male" , 5.8),
				new Person("Female" , 5.4),
				new Person("Male" ,6.2),
				new Person("Male" , 6.0),
				new Person("Male" ,5.0));
		
		List<Person> paralleFilter = filterPerson.parallelStream()
				.filter((Person person) ->person.getHeight() >5.5)
				.filter((Person person) ->person.getSex().equals("Male"))
				.collect(toList());
		Comparator<Person> comparison = 
				(Person p1 , Person p2) ->p1.getHeight().compareTo(p2.getHeight());
		
				/*foreach(Person p:comparison.)
		System.out.println("comparison: "+comparison);*/
	}

}
