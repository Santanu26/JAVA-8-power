package com.shantanu.dp.mediator;

public class Valve implements Colleague {

	private MachineMediator machineMediator;

	@Override
	public void setMediator(MachineMediator machineMediator) {
		this.machineMediator = machineMediator;
	}
	
	public void open() {
		System.out.println("Valve is Opened");
		machineMediator.closed();
	}
	
	public void closed() {
		System.out.println("Valve is closed");
		machineMediator.open();		
	}

}
