import java.util.Scanner;

public class EjercicioSeis {
    public void respuestaEjercicioSeis() {
        /*
         * Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué
         * posición está el mayor número primo.
         */

        Scanner entrada = new Scanner(System.in);
        boolean encontrado = false;
        int sum = 0, promedio = 0;
        int[] arreglo = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
            sum += arreglo[i];
        }
        promedio = sum / arreglo.length;

        for (int a : arreglo) {
            System.out.println("esto es a " + a);
            if (a == promedio) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("El promedio es de: " + promedio + ", este si esta en el arreglo ");
        } else {
            System.out.println("El promedio es de: " + promedio + ", este no esta en el arreglo ");
        }
    }
}
