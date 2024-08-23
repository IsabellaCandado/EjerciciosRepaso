import java.util.Scanner;

public class EjercicioCondicionales {

    public static void nuevaLinea() {
        System.out.println (" ");
    }

    public static void main (String[] args) {
        
        nuevaLinea();

        Scanner in = new Scanner(System.in);

        System.out.print("Por favor, digite el ultimo digito de su cedula:");
        int UltimoDigitoCedula = in.nextInt();
        
        nuevaLinea();

        System.out.print("Indique que dia es hoy:");
        int Dia = in.nextInt();

        nuevaLinea();

        String mensaje;

        if ((UltimoDigitoCedula%2 == 0 && Dia%2 == 0) || (UltimoDigitoCedula%2 == 1 && Dia%2 == 1)) {
            mensaje = "Puedes salir hoy. :)";
        } else {
            mensaje = "No puedes salir hoy. :(";
        }

        System.out.println(mensaje);

        nuevaLinea();
    }
}