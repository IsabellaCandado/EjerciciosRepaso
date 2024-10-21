package model;

public abstract class Room {
    protected String idRoom;
    protected int amountBathrooms;
    protected int amountBeds;
    
    public Room(String idRoom, int amountBathroomsa, int amountBeds) {
        this.idRoom = idRoom;
        this.amountBathrooms = amountBathroomsa;
        this.amountBeds = amountBeds;
    }

    public abstract String useBath();

    public String getId() {
        return this.idRoom;
    }

    public int getAmountBaths() {
        return this.amountBathrooms;
    }

    public int getAmountBeds() {
        return this.amountBeds;
    }
    
}
