import java.util.Scanner;

public class EjercicioMetodos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.println("Por favor, escribe dos numeros que quieras multiplicar:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        imprimirMensaje(multiplicar(n1,n2));
    }
    /**
     * Descripcion: Toma un entero y lo imprime
     * @param int res, el resultado a imprimir
     */
    public static void imprimirMensaje (int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
    /**
     * Descripcion: Multiplica dos enteros
     * @param int num1, el primer entero a multiplicar
     * @param int num2, el segundo entero a multiplicar
     * @return int producto, el resultado de multiplicar ambos entero
     */
    public static int multiplicar(int entero1, int entero2) {
        int producto = entero1 * entero2;
        return producto;
    }
}