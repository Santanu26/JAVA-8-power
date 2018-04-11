package com.shantanu.dp.template;

public class PastaType1 extends PastaDish{

	@Override
	protected void addPasta() {
		System.out.println("This is Type 01 Pasta");
	}

	@Override
	protected void addSouce() {
		System.out.println("This is Type 01 Pasta Souce");
	}

	@Override
	protected void addProtein() {
		System.out.println("This is Type 01 Pasta Protein");
	}

	@Override
	protected void addGarnish() {
		System.out.println("This is Type 01 Pasta Garnish");
	}

}
