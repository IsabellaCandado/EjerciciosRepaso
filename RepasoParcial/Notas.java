import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] asignatura = new String[7];

        bienvenida();
        boolean flag = true;
        int i=0;
        
        while (flag) {
            int aprobadas=0;
            opciones();
            int opcion = in.nextInt();
            flag = menu(opcion,flag,asignatura,i,aprobadas);
        }
    }
    
    public static void bienvenida() {
        System.out.println("Hola, bienvenido a la aplicacion para el seguimiento de tus calificaciones.");
    }

    public static void opciones() {
        System.out.println("Por favor, elige una opcion:");
        System.out.println("1. Ingresar asignatura");
        System.out.println("2. Salir");
    }
    
    public static boolean menu(int opcion, boolean flag, String[] asignatura, int i, int aprobadas) {
        Scanner in = new Scanner(System.in);
        switch (opcion) {
            case 1:
                i++;
                if (i<8) {
                    System.out.print("Ingresa la asignatura: ");
                    String materiaTemp = in.nextLine();
                    asignatura[i]=materiaTemp;

                    System.out.print("¿Cuantas notas quieres registrar? No mas de 10: ");
                    int cantNotas = in.nextInt();
                    in.nextLine();
                    double sumaNotas = 0;
                    for (int j=0 ; j<cantNotas ; j++) {
                        System.out.print("Nota " + (j+1) + ": ");
                        double notaTemp = in.nextDouble();
                        in.nextLine();
                        sumaNotas = sumaNotas + notaTemp;
                    }

                    double promedio = 0;
                    promedio = sumaNotas/cantNotas;
                
                    if (promedio<3.0) {
                        System.out.println("Has reprobado la materia de " + materiaTemp + " con un promedio de: " + promedio);
                    } else {
                        System.out.println("Has aprobado la materia de " + materiaTemp + " con un promedio de: " + promedio);
                        aprobadas++;
                    }
                    break;
                } else {
                    System.out.println("No puedes registrar mas materias");
                    break;
                }

            case 2:
                System.out.println("La cantidad de materias ingresadas es de: " + asignatura.length);
                System.out.println("La cantidad de materias aprobadas es de: " + aprobadas);
                flag=false;
                break;

            default:
                System.out.println("Ingresa una opcion valida");
                break;
        }
        return flag;
    }
}

