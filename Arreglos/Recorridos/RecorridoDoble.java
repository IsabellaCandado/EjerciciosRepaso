public class RecorridoDoble {
    public static void main(String[] args) {

        double notas[] = {4.5, 5.0, 3.2, 3.2};

        double notaMasRepetida = 0;
        int vecesMasRepetida = 0;

        for (int i = 0; i < notas.length; i++ ) {

            double notaTemporal = notas[i];
            int conteo = 0;
            System.out.println("Estoy en el ciclo de ejecucion numero: " + (i+1) + " del ciclo externo");
            System.out.println("Mi nota temporal es: " + notaTemporal);

            for(int j = 0; j < notas.length; j++) {

                if(notaTemporal == notas[j]) {
                    conteo++;
                }

                if (conteo > vecesMasRepetida) {
                    vecesMasRepetida = conteo;
                    notaMasRepetida = notaTemporal;
                    System.out.println("La nueva nota mas encontrada es: " + notaTemporal);
                    System.out.println("Y se repite: " + vecesMasRepetida + " veces");
                }

            }

        }

        System.out.println("Nota mas repetida es: " + notaMasRepetida);

    }
}