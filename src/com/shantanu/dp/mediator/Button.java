package com.shantanu.dp.mediator;

public class Button implements Colleague {
	private MachineMediator machineMediator;

	@Override
	public void setMediator(MachineMediator machineMediator) {
		this.machineMediator = machineMediator;
	}

	public void press() {
		System.out.println("Press the button");
		machineMediator.start();
	}

}
