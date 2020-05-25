package main.java.vehicles.cars;

import main.java.vehicles.components.Engine;

public class Car {

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    private int maxPossibleSpeed;
    private double currentSpeed;
    private int seatHeight;


    public Car(int maxPossibleSpeed, double currentSpeed, int seatHeight, String engine) {
        this.maxPossibleSpeed = maxPossibleSpeed;
        this.currentSpeed = currentSpeed;
        this.seatHeight = seatHeight;
        Engine.engine = engine;
    }

    private void doubleSpeed() {
        this.currentSpeed *= 2;
    }

    private void applyBreakAndContinue(int acceleration, int decrement) {
        setCurrentSpeed(getCurrentSpeed() - decrement);
        setCurrentSpeed(getCurrentSpeed() + acceleration + Engine.doCalc());
    }

}