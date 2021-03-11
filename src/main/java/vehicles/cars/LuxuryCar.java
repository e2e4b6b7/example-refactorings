package main.java.vehicles.cars;

import main.java.vehicles.components.vehicleComponents.EngineImpl;

public class LuxuryCar extends Car {

    private final VehicleType type = VehicleType.SEDAN;
    private String offsets;

    public String toString() {
        final String string = getString();
        return string +
                ", noOfSeats=" + offsets +
                ", engine='" + EngineImpl.engine + '\'' +
                '}';
    }

    private String getString() {
        return "LuxuryCar{" +
                "panoramicSunroof=" + EngineImpl.turbo;
    }

    @SuppressWarnings("checkstyle:executablestatementcount")
    public LuxuryCar(int maxSpeed, String noOfSeats, double currentSpeed,
                     int seatHeight, String engine, boolean panoramicSunroof) {
        super(maxSpeed, currentSpeed, seatHeight, engine);
        EngineImpl.turbo = panoramicSunroof;
        this.offsets = noOfSeats;
    }

    public boolean isPanoramicSunroof() {
        return EngineImpl.turbo;
    }


    private void doubleSpeed() {
        this.getSpeed().setCurrentSpeed(this.getSpeed().getCurrentSpeed() * 2);
    }

    public String getOffsets() {
        return offsets;
    }

    public void setNoofseats(String noofseats, double notimportant1) {
        this.offsets = noofseats;
    }
}
