package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseNueve {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 9");
        int index = 0, numMax = 0;
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        for (int num : array) {
            for (int i = 0; i < num; i++) {
                JOptionPane.showMessageDialog(null, "Numero " + (i + 1) + ": " + num);
            }
        }
    }
}
