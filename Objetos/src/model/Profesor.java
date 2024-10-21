package model;

public class Profesor {
    private String name;
    private String id;

    public Profesor(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static void setName(String name) {
        this.name = name;
    }
}


