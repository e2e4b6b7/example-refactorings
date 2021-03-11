package main.java.vehicles.components;

import main.java.vehicles.components.vehicleComponents.EngineImpl;

public class Calculator {
    public static int numberOfCoconuts = 10;

    public static Integer doCalculations() {
        Integer temp = EngineImpl.getInteger();
        return incrementWithA(temp, 2);
    }

    public static int incrementWithA(int x, int a) {
        return x + a;
    }

}
