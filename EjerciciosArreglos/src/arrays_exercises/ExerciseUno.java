package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseUno {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 1");
        int size, index;
        size = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] usuarios = Utiility.readIntegerArray("Ingrese numero ", size);
        index = Utiility.bigNumArray(usuarios);
        JOptionPane.showMessageDialog(null, "El numero mayor esta en la posicion " + index + " numero: " + usuarios[index]);
    }
}