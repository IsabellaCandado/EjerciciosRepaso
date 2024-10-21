package model;
import model.JuniorRoom;
import model.IEncendible;

public class MidRoom extends JuniorRoom implements IEncendible {
    
    private int amountTv;
    private boolean miniFridge;

    public MidRoom(String id, int amountBathrooms, int amountBeds, boolean sofaCama, int amountTv, boolean miniFridge) {
        super(id, amountBathrooms, amountBeds, sofaCama);

        this.amountTv = amountTv;
        this.miniFridge = miniFridge;
    }

    public int getAmountTv() {
        return amountTv;
    }

    public boolean getMiniFridge() {
        return miniFridge;
    }

    @Override
    public String turnOnLights() {
        return "Encendiste la luz";
    }

    @Override
    public String turnOffLights() {
        return "Apagaste la luz";
    }
}
