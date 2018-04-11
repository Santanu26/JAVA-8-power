package com.shantanu.dp.state;

public class IdleState implements IState{

	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("Please wait..Dollar inserted");
		vendingMachine.setCurrentState(vendingMachine.getCurrentState());
	}

	@Override
	public void ejectDollar(VendingMachine vendingMachine) {
		System.out.println("No Money to required");
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		System.out.println("Payment Required");
	}

}
