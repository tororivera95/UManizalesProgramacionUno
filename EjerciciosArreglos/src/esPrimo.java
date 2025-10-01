public class esPrimo {

    public boolean esPrimo(int num) {

        int contador = 0;
        for (int i = 0; i < num; i++) {
            if (num % (i + 1) == 0) {
                contador++;
            }
        }
        if (contador > 2) {
            return false;
        }
        return true;
    }

    public int[] esPrimoRango(int numMin, int numMax) {

        int[] numerosPrimos = new int[10];
        int contador = 0, position = 0;
        for (int i = numMin; i < numMax; i++) {
            if (position == 10) {
                break;
            } else {
                for (int j = 0; j <= i; j++) {
                    if (i % (j + 1) == 0) {
                        contador++;
                    }
                }
                if (contador <= 2) {
                    numerosPrimos[position] = i;
                    position++;
                }
                contador = 0;
            }

        }
        return numerosPrimos;
    }

    public int calcularFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
