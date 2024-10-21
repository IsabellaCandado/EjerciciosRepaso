import java.util.Scanner;

public class Arreglos{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingresa el numero de datos a registrar: ");
        int tam = in.nextInt();
        in.nextLine();

        double[] notas = new double[tam];
        String[] nombres = new String[tam];

        for(int i = 0; i < notas.length; i++) {
            System.out.println("Nombre:");
            String nombre = in.nextLine();
            nombres[i] = nombre;
            
            System.out.println("Nota:");
            Double nota = in.nextDouble();
            in.nextLine();
            notas[i] = nota;
        }

        for(int i = 0; i < notas.length; i++) {
            System.out.println(nombres[i] + " saco " + notas[i]);
        }

    }
}