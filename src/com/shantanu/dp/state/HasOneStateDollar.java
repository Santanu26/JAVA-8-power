package com.shantanu.dp.state;

public class HasOneStateDollar implements IState {

	
	public final VendingMachine vendingMachine;
	
	public HasOneStateDollar(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		System.out.println("Already has one Dollar");
		vendingMachine.doReturnMoney();
		vendingMachine.setCurrentState(vendingMachine.getIdleState());
	}

	@Override
	public void ejectDollar(VendingMachine vendingMachine) {
		System.out.println("Return Money");
		vendingMachine.doReturnMoney();
		vendingMachine.setCurrentState(vendingMachine.getIdleState());
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		System.out.println("releasing product");
		if(vendingMachine.getCount()>1) {
			doReleaseProduct();
			vendingMachine.setCurrentState(vendingMachine.getOutOfStock());
		} else {
			doReleaseProduct();
			vendingMachine.setCurrentState(vendingMachine.getOutOfStock());
		}
	}
	
	
	public void doReleaseProduct() {
		System.out.println("Take this , Do you want to buy another");
	}

}
