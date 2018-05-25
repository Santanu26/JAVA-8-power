package com.shantanu.dp.mediator;

public class Heater implements Colleague {
	private MachineMediator machineMediator;

	@Override
	public void setMediator(MachineMediator machineMediator) {
		this.machineMediator = machineMediator;
	}
	public void on(int temp) {
		if(machineMediator.checkTemparature(temp)) {
			System.out.println("Machine  is set Temparature to : "+temp);
			machineMediator.off();
		}
	}
	public void off() {
		System.out.println("Heater is Off");
		machineMediator.wash();
		}

}
