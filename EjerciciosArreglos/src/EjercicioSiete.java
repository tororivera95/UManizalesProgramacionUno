import java.util.Scanner;

public class EjercicioSiete {
    public void respuestaEjercicioSiete() {
        /*
         * Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué
         * posición está el mayor número primo.
         */

        int[] arreglo = new int[10];
        int num = 0, numMayor = 0, digito = 0, sum = 0, pos = 0;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            arreglo[i] = num;
            while (num > 0) {
                digito = num % 10; // último dígito
                sum += digito;
                num = num / 10; // quitar el último dígito
            }
            if (sum > numMayor) {
                numMayor = sum;
                pos = i;
            }
            sum = 0;
        }

        System.out.println(
                "El numero con mayor suma de digitos es: " + numMayor + " y se encuentra en la posicion: " + pos);
    }
}
