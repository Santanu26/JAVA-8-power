package com.shantanu.dp.state;

public interface IState {
	
	public void insertDollar(VendingMachine vendingMachine);
	public void ejectDollar(VendingMachine vendingMachine);
	public void dispense(VendingMachine vendingMachine);
}
