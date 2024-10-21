package model;
import model.JuniorRoom;
import model.MidRoom;

public class Controller {

    MidRoom midRoom;


    public Controller(){

    }

    public void createRoom(String id, int amountBathrooms, int amountBeds, boolean sofaCama, int amountTv, boolean miniFridge) {
        this.midRoom = new MidRoom(id, amountBathrooms, amountBeds, sofaCama, amountTv, miniFridge);
    }

    public String showRoom() {
        String mensaje = "Esta es la habitacion: " + this.midRoom.getId() + 
            "\nQue tiene " + this.midRoom.getAmountBaths() + " banos, " 
                + this.midRoom.getAmountBeds() + " camas, " + this.midRoom.getAmountTv() + " televisores. ";

            
        if (this.midRoom.getSofaCama()) {
            mensaje = mensaje + "\nAdemas, tiene un comodo sofacama! :D";
        }

        if (this.midRoom.getMiniFridge()) {
            mensaje = mensaje + "\nY una nevera para que siempre tus bebidas esten frescas!\n";
        }

        mensaje+=midRoom.turnOnLights();
        
        return mensaje;
    }
}
