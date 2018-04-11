package com.shantanu.dp.template;

public abstract class PastaDish {
	// So the procedure is fixed for all template class
	public final void makeReceive() {
		boilWater();
		addPasta();
		cookPasta();
		drainInAndPlate();
		addSouce();
		addProtein();
		addGarnish();
	}
	
	protected abstract void addPasta();
	protected abstract void addSouce();
	protected abstract void addProtein();
	protected abstract void addGarnish();
	
	public void boilWater() {
		System.out.println("Boiling Water.");
	}
	public void cookPasta() {
		System.out.println("Now cook the Pasta");
	}
	public void drainInAndPlate() {
		System.out.println("Drain in and Put is in Plate");
	}
			
 
}
