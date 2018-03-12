package com.company.javapractice.Vehicle;

public final class F1Auto extends Car {
    private String driverName;
    private float setup;

    public F1Auto(int power, int maxSpeed, String type, String driverName, float setup) {
        super(power, maxSpeed, type);
        this.driverName = driverName;
        this.setup = setup;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getSetup() {
        return setup;
    }

    public void setSetup(float setup) {
        this.setup = setup;
    }

    @Override
    public double competitiveness() {
        double competitiveness = getPower() * getMaxSpeed() * setup;
        return competitiveness;
    }

    @Override
    public String toString() {
        return "This Formula 1 car " +
                "has " + getPower() + " HP" +
                ", it's maximum speed is " + getMaxSpeed() + " km/h" +
                ", and the type is " + getType() + ". " +
                "The driver's name is " + driverName +
                ". ";
    }
}
