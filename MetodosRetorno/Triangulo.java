import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (esTriangulo(n1,n2,n3)) {
            System.out.println("Se puede hacer el triangulo");
        } else {
            System.out.println("No se puede hacer el triangulo");
        }
    }

    public static boolean esTriangulo (int n1, int n2, int n3) {
        if ((n1+n2<n3)||(n1+n3<n2)||(n3+n2<n1)) {
            return true;
        } else {
            return false;
        }
    }
}