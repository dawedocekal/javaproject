package org.redhat.vehicles;

public class Car extends MotorVehicle {

    private int numberOfWheels;
    private String brand;

    public Car(String brand, int numberOfWheels) {
        super();
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
