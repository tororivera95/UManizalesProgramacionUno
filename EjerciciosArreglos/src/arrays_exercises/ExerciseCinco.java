package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseCinco {
    public static void execute(){
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 5");
        int index, total;
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        index = Utiility.bigNumArray(array);
        total = Utiility.cantNumberArray(array, array[index]);
        JOptionPane.showMessageDialog(null, "Cantidad de veces que se encuentra en la array el numero " + array[index] + " es de: " + total);
    }
}
