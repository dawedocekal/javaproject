package org.redhat.vehicles;

import org.redhat.interfaces.Vehicle;

public class NonMotorVehicle implements Vehicle {

	public boolean hasEngine;

	public NonMotorVehicle() {
		hasEngine = false;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	public boolean isHasEngine() {
		return hasEngine;
	}

	public void setHasEngine(boolean hasEngine) {
		this.hasEngine = hasEngine;
	}

}
