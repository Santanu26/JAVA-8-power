package com.shantanu.dp.mediator;

public interface MachineMediator {
	public void wash();
	public void start();
	public void open();
	public void closed();
	public boolean checkTemparature(int temp);
	public void on();
	public void off();
}
