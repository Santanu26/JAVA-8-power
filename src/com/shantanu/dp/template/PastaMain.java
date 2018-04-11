package com.shantanu.dp.template;

public class PastaMain {
	public static void main(String[] args) {
		PastaDish pasta1 = new PastaType1();
		pasta1.makeReceive();
		
		separateLine();
		
		PastaDish pasta2 = new PastaType2();
		pasta2.makeReceive();
	}
	private static void separateLine() {
		System.out.println("_____________________");
		System.out.println("NOW COOK ANOTHER PASTA");
		System.out.println("_____________________");
	}
}
