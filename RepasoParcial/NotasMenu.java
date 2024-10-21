import java.util.Scanner;

public class NotasMenu {

	// Atributos de la clase Ejecutable
	private Scanner escaner;
	private static boolean flag;

	private Menu() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run(boolean flag)
	{

		flag = false;

		while (!flag) {

			System.out.println("\n \n Bienvenido al menu:\n");
			System.out.println("Opciones:\n" + "1. Opcion 1 \n" + "2. Opcion 2\n"
					+ "3. Opcion 3 \n" + "4. Opcion 4 \n" + "5. Salir del programa \n");

			int option = escaner.nextInt();

			escaner.nextLine();

			switch (option) {
					case 1:
						opcionUno();
						break;
					case 2:
						opcionDos();
						break;
					case 3:
						opcionTres();
						break;
					case 4:
						opcionCuatro();
						break;
					case 5:
						flag = true;
						System.exit(0);
						break;
					default:
						System.out.print("Por favor ingrese una opcion valida");
						continue;
			}

		}

	}

	public static void main(String[] args) {
		Menu mainApp = new Menu();
		mainApp.run(flag);
	}

    public void opcionUno() {
        System.out.println("Elegiste opcion uno");
    }

    public void opcionDos() {
        System.out.println("Elegiste opcion dos");
    }

    public void opcionTres() {
        System.out.println("Elegiste opcion tres");
    }

    public void opcionCuatro() {
        System.out.println("Elegiste opcion cuatro");
    }

}