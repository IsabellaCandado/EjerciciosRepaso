package model;

import model.Room;

public class JuniorRoom extends Room {
    
    protected boolean sofaCama;

    public JuniorRoom(String id, int amountBathrooms, int amountBeds, boolean sofaCama){

        super(id, amountBathrooms, amountBeds); //se refiere al construstor de la clase padre, esos son los atributos que heredó

        this.sofaCama = sofaCama;

    }

    @Override
    public String useBath(){
       return "Estoy usando el bano, estoy contento";
    }
    
    public boolean getSofaCama() {
        return sofaCama;
    }

    
}
