package model;

public class Car extends MotorVehicle implements IRoller {
    
    public Car(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String startUp() {
        return "Arrancando...\n";
    }
    
    @Override
    public String move() {
        return "Moviendose por la carretera!\\n";
    }

    @Override
    public String stop() {
        return "Deteniendose...\n";
    }
}
