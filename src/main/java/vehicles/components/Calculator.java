package main.java.vehicles.components;

public class Calculator {
    public static int numberOfCoconuts = 10;

    public static Integer doCalculations() {
        Integer temp1 = 10;
        temp1 *= 3;
        Integer temp = temp1;
        return incrementWithA(temp, 2);
    }

    public static int incrementWithA(int x, int a) {
        return x + a;
    }

}
