package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseCuatro {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 4");
        int index, numFinal;
        numFinal = Utiility.readIntegerPos("Ingrese el numero que quiere validar al final ");
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        for (int i = 0; i < array.length; i++) {
           if(Utiility.isFinalNumber(array[i], numFinal)){
               JOptionPane.showMessageDialog(null, "Numero finalizado en 4 " + array[i] + " se encuentra en la posicion " + i);
           }
        }
    }
}
