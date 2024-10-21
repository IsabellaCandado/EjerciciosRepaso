package model;

public abstract class Vehicle {
    protected double maxSpeed;

    public Vehicle (double maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public abstract String travel();
}