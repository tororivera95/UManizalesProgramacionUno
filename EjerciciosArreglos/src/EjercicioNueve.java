import java.util.Scanner;

public class EjercicioNueve {
    public void respuestaEjercicioNueve() {
        /*
         * Leer 10 números enteros, almacenarlos en un arreglo y mostrar en pantalla
         * todos los enteros comprendidos entre 1 y cada uno de los números
         * almacenados en el arreglo.
         */

        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        for (int i : numeros) {
            System.out.println("\nNumero: " + i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j + ", ");
            }
        }
    }
}
