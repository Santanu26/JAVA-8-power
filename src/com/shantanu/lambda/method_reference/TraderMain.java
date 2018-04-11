package com.shantanu.lambda.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.joining;

public class TraderMain {
	public static void main(String[] args) {
		Trader raul = new Trader("Raul", "Cambridge");
		Trader maria = new Trader("Maria", "Oxford");
		Trader alan = new Trader("alan", "Dhaka");
		Trader brian = new Trader("brian", "Chittagong");
		Trader shantanu = new Trader("Shantanu", "Cambridge");
		Trader santanu = new Trader("santanu", "Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(raul, 2012, 500),
				new Transaction(brian, 2018, 1500),
				new Transaction(santanu , 2018 , 1000),
				new Transaction(shantanu , 2016 , 1500),
				new Transaction(alan, 2017, 520),
				new Transaction(maria, 2012, 800));

		// Find all transactions in 2012 and sort by value 
		// @formatter:off
		List<Transaction> valueSortedfor2011 = transactions.stream()
		.filter(transaction -> transaction.getYear() == 2012)
		.sorted(comparing(Transaction::getAmount))
		.collect(toList());
		System.out.println("Find all transactions in 2012 and sort by value: "+valueSortedfor2011);
		// @formatter:on

		//What are all the unique cities where the traders work?
		// @formatter:off
		List<String> uniqueCities = transactions.stream()
				.map(transaction ->transaction.getTrader().getCity())
				.distinct()
				.collect(toList());
		System.out.println("all the unique cities where the traders work: "+uniqueCities);
		//or
		Set<String> uniqueCities1 = transactions.stream()
				.map(transaction ->transaction.getTrader().getCity())
				.collect(toSet());
		System.out.println(uniqueCities1);
		// @formatter:on
		//Find all traders from Cambridge and sort them by name
		// @formatter:off
		 List<Trader> traderOfCambridge = transactions.stream()
				 .map(Transaction::getTrader)
				 .filter(transaction ->transaction.getCity()
						 .equalsIgnoreCase("Cambridge"))
				 .distinct()
				 .sorted(comparing(Trader::getName))
				 .collect(toList());
		 System.out.println("traders from Cambridge and sort them by name: "+traderOfCambridge);
		// @formatter:on


		 // Return a string of all traders’ names sorted alphabetically
		 String tradersName = transactions.stream()
				 .map(transaction ->transaction.getTrader().getName())
				 .distinct()
				 .sorted()
				.reduce("", (n1, n2) -> n1 + n2);
		 System.out.println(tradersName);
		 
		 String traderNameWithJoining = transactions.stream()
				 .map(transaction ->transaction.getTrader().getName())
				 .distinct()
				 .sorted()
				 .collect(joining());
		 System.out.println(traderNameWithJoining);
		 
		 //Are any traders based in Chittagong?
		 boolean isChittagongTraders = transactions.stream()
		 .anyMatch(transaction->transaction
				 .getTrader()
				 .getCity()
				 .equalsIgnoreCase("Chittagong"));
		 System.out.println("Trader : "+isChittagongTraders);
		 
		 //print all transaction values from the traders living in Cambridge?
		   transactions.stream()
		 .filter(t->"cambridge".equalsIgnoreCase(t.getTrader().getCity()))
		 .map(Transaction :: getAmount)
		 .forEach(System.out::println);
		   
		   //What’s the highest value of all the transactions?
		   Optional<Integer> highestValue = transactions.stream()
				   .map(Transaction:: getAmount)
				   .reduce(Integer:: max);
		   System.out.println("Highest value for all the transactions: "+highestValue);
		   // Find the transaction with the smallest amount
		   Optional<Integer> smallestValue01 = transactions.stream()
				   .map(Transaction :: getAmount)
				   .reduce(Integer:: min);
		   Optional<Transaction> smallestValue02 = transactions.stream()
				   .reduce((t1 , t2) -> t1.getAmount() < t2.getAmount()? t1:t2);
		   
		   Optional<Transaction> smallestValue03 = transactions.stream()
				   .min(comparing(Transaction :: getAmount));
		   System.out.println("Smallest value for all the transactions: "+smallestValue03);
		   
		   
		   
		   
				 
	}

}
