package com.shantanu.dp.state;

public class VendingMachine implements IState{
	private State idleState;
	private State currentState;
	private State hasOneDollarState;
	private State outOfStock;
	private int   count;

	private IState state;
	
	public VendingMachine(int count) {
		/*idleState = new 
		hasOneDollarState = new HasOneStateDollar(this);
		outOfStock = new OutOfStock();*/
		if (count > 0) {
			currentState = State.idle;
			this.count = count;
		} else {
			currentState = State.outOfStock;
			this.count = 0;
		}
	}

	public void insertDollar() {	
		if (currentState == State.idle) {
			currentState = State.hasOneDollar;
		} else if (currentState == State.hasOneDollar) {
			doReturnMoney();
			currentState = State.idle;
		} else if (currentState == State.outOfStock) {
			doReturnMoney();
		}
	}

	public void doReturnMoney() {
		System.out.println("Take your money...");
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setState(IState state) {
		this.state = state;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getHasOneDollarState() {
		return hasOneDollarState;
	}

	public void setHasOneDollarState(State hasOneDollarState) {
		this.hasOneDollarState = hasOneDollarState;
	}

	public State getOutOfStock() {
		return outOfStock;
	}

	public void setOutOfStock(State outOfStock) {
		this.outOfStock = outOfStock;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getIdleState() {
		return idleState;
	}

	public void setIdleState(State idleState) {
		this.idleState = idleState;
	}

	@Override
	public void insertDollar(VendingMachine vendingMachine) {
		state.insertDollar(vendingMachine);		
	}

	@Override
	public void ejectDollar(VendingMachine vendingMachine) {
		state.ejectDollar(vendingMachine);
	}

	@Override
	public void dispense(VendingMachine vendingMachine) {
		state.dispense(vendingMachine);
	}

}
