package main.java.vehicles.birds.impl;

@Deprecated
public abstract class PhysicalAppearance {
    private String color;
    private double weight;

    public PhysicalAppearance() {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}