package com.shantanu.lambda.ex;

import java.util.Scanner;

public class FrequencyCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		frequencyWord(str);
	}
	
	public static void frequencyWord(String str) {
		int strLength = str.length();
		int count = 0;
		char ch;
		for (char c = 'A'; c <= 'z'; c++) {
			count = 0;
			for (int i = 0; i < strLength; i++) {
				ch = str.charAt(i);
				if (ch == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Charcter : " + c + "Count: " + count);
			}
		}

	}

}
