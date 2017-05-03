package org.redhat.vehicles;

import org.redhat.interfaces.Vehicle;

public class MotorVehicle implements Vehicle {

	public boolean hasEngine;

	public MotorVehicle() {
		hasEngine = true;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}


	public void refluel() {

	}

	public void signalLeft() {

	}

	public void signalRight() {

	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}


}
