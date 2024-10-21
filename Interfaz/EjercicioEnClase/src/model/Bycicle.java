package model;

public class Bycicle extends Vehicle implements IRoller {
    
    public Bycicle(double maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public String travel() {
        startUp();
        move();
        stop();

        return "El viaje ha finalizado!";
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
