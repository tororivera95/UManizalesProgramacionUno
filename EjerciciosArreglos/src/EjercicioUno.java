import java.util.Scanner;

public class EjercicioUno {
    public void respuestaEjercicioUno() {
        /*
         * 1. Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición
         * del arreglo está el mayor
         * número leído.
         */
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int num = 0, numMayor = 0, numPosicion = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un valor numerico entero: ");
            num = entrada.nextInt();
            numeros[i] = num;
            if (num > numMayor) {
                numMayor = num;
                numPosicion = i;
            }
        }

        System.out.println("El numero mayor esta en la posicion " + numPosicion);
    }
}
