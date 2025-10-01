import java.util.Scanner;

public class EjercicioOcho {

    /**
     * Leer 10 números enteros, almacenarlos en un arreglo y calcularle el
     * factorial a cada uno de los números leídos almacenándolos en otro arreglo,
     * luego mostrar en pantalla cada
     * número con su factorial.
     */

     int[] arreglo = new int[10];
     int[] factorial = new int[10];
     int num;

     esPrimo esPrimo = new esPrimo();

    public void respuestaEjercicioOcho() {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero: ");
            num = entrada.nextInt();
            arreglo[i] = num;
            factorial[i] = esPrimo.calcularFactorial(num); 
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("El factorial de " + arreglo[i] + " es " + factorial[i]);
        }
    }
}
