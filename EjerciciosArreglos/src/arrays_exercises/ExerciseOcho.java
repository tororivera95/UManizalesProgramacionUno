package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseOcho {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 8");
        int index = 0;
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        long[] arrayFactorial = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayFactorial[i] = Utiility.calcFactorialArray(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            JOptionPane.showMessageDialog(null, "El factorial de " + array[i] + " es " + arrayFactorial[i]);
        }
    }
}
