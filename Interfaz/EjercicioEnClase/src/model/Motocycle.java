package model;

public class Motocycle extends MotorVehicle implements IRoller{
    
    public Motocycle(double maxSpeed) {
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
