package ui;
import java.util.Scanner;

public class Arreglos{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int tam =in.nextInt();

        int[] notas = new notas[tam];
        String[] nombres = new nombres[tam];

        for(int i = 0; i < notas.length; i++) {
            System.out.print("Nombre:");
            nombres[i];

            System.out.print("Nota:");
            notas[i];
        }

        for(int i = 0; i < notas.length; i++) {
            System.out.print(nombres[i] + "saco " + notas[i]);
        }

    }
}