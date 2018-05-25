package com.shantanu.dp.mediator;

public class CottonMediator implements MachineMediator {

	private final Machine machine;
	private final Heater heater;
	// private final Motor motor;
	private final Valve valve;

	public CottonMediator(Machine machine, Heater heater, Valve valve) {
		this.machine = machine;
		this.heater = heater;
		this.valve = valve;
	}

	@Override
	public void wash() {
		machine.wash();
	}

	@Override
	public void start() {
		machine.start();
	}

	@Override
	public void open() {
		valve.open();
	}

	@Override
	public void closed() {
		valve.closed();
	}

	@Override
	public boolean checkTemparature(int temp) {
		return false;
	}

	@Override
	public void on() {
		heater.on(40);
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

}
