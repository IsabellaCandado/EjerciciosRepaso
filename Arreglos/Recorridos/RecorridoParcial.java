public class RecorridoParcial {

    public static void main(String[] args) {
        double notas[] = {3.2, 4.5, 5.0, 4.1, 3.0, 3.8, 4.4, 3.3};
        boolean pierdeMateria = false;

        for (int i = 0; i < notas.length && !pierdeMateria; i++) {

            System.out.println("Revisando nota: " + notas[i]);

            if(notas[i] < 3) {
                pierdeMateria = true;
            }
        }

        if (pierdeMateria) {
            System.out.println("Al menos un estudiante perdió");
        } else {
            System.out.println("Todos pasaron");
        }

    }

}