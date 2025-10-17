package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseSiete {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 7");
        int index = 0, numMax = 0;
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        for(int i=0; i<array.length; i++){
            if(Utiility.sumDigitNumber(array[i]) > numMax){
                numMax = array[i];
                index = i;
            }
        }
        JOptionPane.showMessageDialog(null, "El numero con la suma mayor de sus digitos es: " + numMax + " en la posicion " + index);
    }
}
