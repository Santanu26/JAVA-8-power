package com.shantanu.dp.state;

public final class State {
	private State() {}
	public final static State hasOneDollar = new State();
	public final static State idle = new State();
	public final static State outOfStock = new State();
}
