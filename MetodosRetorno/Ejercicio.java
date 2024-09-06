import java.util.Scanner;
import java.lang.Math;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (esTriangulo(num1, num2, num3)){
            System.out.println("Se puede formar el triangulo");
        } else {
            System.out.println("No se puede formar el triangulo");
        }
    }

    public static boolean esTriangulo (int num1, int num2, int num3) {
        if ((num1 + num2) < num3) {
            if ((num1 + num3 < num2)){
                if ((num3 + num2) < num1) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}