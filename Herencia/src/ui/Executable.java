package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

    private Scanner reader;
    private Controller control;

    public Executable(){
        this.reader = new Scanner(System.in);
        this.control = new Controller();
    }

    public void run() {

        System.out.println("Vamos a crear la habitacion Mid\n");
        
        System.out.print("Escribe el id de la habitacion: ");
        String id = reader.nextLine();

        System.out.print("Numero de banos:");
        int amountBathrooms = reader.nextInt();
        
        System.out.print("Numero de camas:");
        int amountBeds = reader.nextInt();

        boolean sofaCama = false;
        System.out.println("Tiene sofacama?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int op = reader.nextInt();
        reader.nextLine();

        if (op==1) {
            sofaCama = true;
        }

        System.out.print("Numero de televisores:");
        int amountTv = reader.nextInt();

        boolean miniFridge = false;
        System.out.println("Tiene nevera?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int op2 = reader.nextInt();
        reader.nextLine();

        if (op2==1) {
            miniFridge = true;
        }

        control.createRoom(id, amountBathrooms, amountBeds, sofaCama, amountTv, miniFridge);

        System.out.println(control.showRoom());
    }

    public static void main(String[] args) {
        Executable mainApp = new Executable();
        mainApp.run();
    }
}