package utils;

import javax.swing.*;

public class Utiility {
    public static int readIntegerPos(String message) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(null, message);

                if (input == null) { // Usuario presionó Cancelar
                    return -1;
                }

                int number = Integer.parseInt(input);

                if (number < 0) {
                    JOptionPane.showMessageDialog(null, "Solo se permiten números positivos");
                } else {
                    return number;
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten números enteros");
            }
        }
    }

    public static byte readByteGenerPos(String message) {
        while (true) {
            try {
                while (true) {
                    byte number = Byte.parseByte(JOptionPane.showInputDialog(null, message));
                    if (number == 1 || number == 2) {
                        return number;
                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo se permiten dos opciones 1 o 2");
            }
        }
    }

    public static int[] readIntegerArray(String message, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            do {
                array[i] = readIntegerPos(message + (i + 1));
                if (array[i] < 0) {
                    JOptionPane.showMessageDialog(null, "No se permiten numeros negativos");
                }
            } while (array[i] < 0);
        }
        return array;
    }

    public static String menu() {

        return "======== MENU PRINCIPAL ======== \n" +
                "1. Ejercicio uno \n" +
                "2. Ejercicio dos \n" +
                "3. Ejercicio tres \n" +
                "4. Ejercicio cuatro \n" +
                "5. Ejercicio cinco \n" +
                "6. Ejercicio seis \n" +
                "7. Ejercicio siete \n" +
                "8. Ejercicio ocho \n" +
                "9. Ejercicio nueve \n" +
                "10. Ejercicio diez \n" +
                "0. Salir \n";
    }

    public static int bigNumArray(int[] array) {
        int mayor = 0, index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean isPrimeNumber(int num) {
        boolean validador = false;
        int contador = 0;
        for (int j = 0; j < num; j++) {
            if (num % (j + 1) == 0) {
                contador++;
            }
        }
        if (contador <= 2) {
            return true;
        }
        return false;
    }

    public static int[] primesInRange(int inicio, int fin, int index) {
        int[] primos = new int[index];
        int cont = 0;
        for (int i = inicio; i <= fin; i++) {
            if (cont != index) {
                if (Utiility.isPrimeNumber(i)) {
                    primos[cont] = i;
                    cont++;
                }
            } else {
                return primos;
            }
        }
        return primos;
    }

    public static boolean isFinalNumber(int num, int numFinal) {
        boolean validador = false;
        if (num % 10 == numFinal) {
            return validador = true;
        }
        return validador;
    }

    public static int cantNumberArray(int[] array, int num) {
        int cont = 0;
        for (int i : array) {
            System.out.println("i " + i + " numeroo " + num);
            if (i == num) {
                cont++;
            }
        }
        return cont;
    }

    public static int promedNumArray(int[] array) {
        int promedio = 0, sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        promedio = sum / array.length;
        return promedio;
    }

    public static boolean isNumberBeArray(int[] array, int num) {
        for (int i : array) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static int sumDigitNumber(int num) {
        int digito = 0, sum = 0;
        while (num > 0) {
            digito = num % 10;
            sum += digito;
            num = num / 10;
        }
        return sum;
    }

    public static long calcFactorialArray(int num) {
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static double readValidateSalary(String message){
        while (true) {
            try {
                double salary = Double.valueOf(JOptionPane.showInputDialog(null, message));
                if (salary < 0) {
                    JOptionPane.showMessageDialog(null, "Solo se permiten números positivos");
                } else {
                    return salary;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato invalido");
            }
        }
    }
}