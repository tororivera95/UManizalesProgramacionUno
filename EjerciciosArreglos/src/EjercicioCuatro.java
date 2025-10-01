import java.util.Scanner;

public class EjercicioCuatro {

    public void respuestaEjercicioCuatro() {
        /*
         * Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué
         * posiciones se encuentran
         * los números terminados en 4
         */

        Scanner entrada = new Scanner(System.in);
        int num = 0;
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese un numero: ");
            num = entrada.nextInt();
            numeros[i] = num;
            if (num % 10 == 4) {
                System.out.println("El numero " + num + " se encuentra en la posicion " + i);
            }
        }

    }
}
