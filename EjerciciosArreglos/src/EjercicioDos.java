import java.util.Scanner;

public class EjercicioDos {
    public void respuestaEjercicioDos() {

        /*
         * 2. Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición
         * del arreglo está el mayor
         * número primo leído.
         */

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int num = 0, numPosicion = 0;
        boolean primo = false;
        esPrimo esPrimo = new esPrimo();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero positivo: ");
            num = entrada.nextInt();
            numeros[i] = num;

            primo = esPrimo.esPrimo(num);

            if (primo) {
                System.out.println("Entrooo");
                numPosicion = i;
            }
        }
        System.out.println("El numero primo mayor esta en la posicion " + numPosicion);

    }
}
