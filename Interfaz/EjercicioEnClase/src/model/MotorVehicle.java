package model;

public abstract class MotorVehicle extends Vehicle {
    
    public MotorVehicle(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String travel() {
        return "";
    }
}
