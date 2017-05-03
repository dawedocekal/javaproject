package org.redhat.vehicles;

public class Bike extends NonMotorVehicle {

	public static final int NUMBER_OF_WHEELS = 2;
	private String brand;

	public Bike(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static int getNumberOfWheels() {
		return NUMBER_OF_WHEELS;
	}

}
