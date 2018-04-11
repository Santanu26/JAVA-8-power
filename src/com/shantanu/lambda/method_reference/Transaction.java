package com.shantanu.lambda.method_reference;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
	private final Trader trader;
	private int year;
	private int amount;

}
