package me.welazure.project.modules.thirdmodule;

public class Vehicle {
    private String make;
    private String model;
    private int fuelLevel;

    public Vehicle(String make, String model, short fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    /**
     * Fuels the Vehicle
     *
     * @param fuelLevel The fuel level to add
     */
    public void reFuel(int fuelLevel) {
        this.fuelLevel += fuelLevel;
    }

    /**
     * Get the fuel level
     *
     * @return The fuel level
     */
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Gets the make of the vehicle
     *
     * @return The make of the Vehicle
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the vehicle
     *
     * @return The model of the vehicle
     */
    public String getModel() {
        return model;
    }
}
