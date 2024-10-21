package model;

public class Airplane extends MotorVehicle implements IFlyer, IRoller {
    
    public Airplane(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String travel() {
        startUp();
        move();
        takeOff();
        fly();
        land();
        move();
        stop();
        
        return "El viaje ha finalizado!";
    }

    @Override
    public String takeOff() {
        return "Despegando...\n";
    }

    @Override
    public String fly() {
        return "Volando por el aire!\n";
    }

    @Override
    public String land() {
        return "Aterrizando...\n";
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
