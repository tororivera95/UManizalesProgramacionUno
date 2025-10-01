import java.util.Scanner;

public class EjercicioCinco {
    public void respuestaEjercicioCinco() {

        /*
         * Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas
         * veces está repetido el
         * mayor.
         */

        Scanner entrada = new Scanner(System.in);
        int num = 0, numMayor = 0;
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
            if (arreglo[i] > numMayor) {
                numMayor = arreglo[i];
            }
        }

        for (int i : arreglo) {
            if (i == numMayor) {
                num++;
            }
        }
        System.out.println("El numero mayor es: " + numMayor + "\nEl numero se repite: " + num + " veces");
    }
}
