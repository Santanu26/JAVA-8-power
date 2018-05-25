package com.shantanu.dp.mediator;

public class Machine implements Colleague {

	private MachineMediator machineMediator;

	@Override
	public void setMediator(MachineMediator machineMediator) {
		this.machineMediator = machineMediator;
	}

	public void start() {
		machineMediator.open();
	}
	public void wash() {
		machineMediator.wash();
	}

}
