package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseSeis {
    public static void execute(){
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 6");
        int index, promedio = 0;
        index = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        int[] array = Utiility.readIntegerArray("Ingrese numero ", index);
        promedio = Utiility.promedNumArray(array);
        if(Utiility.isNumberBeArray(array, index)){
            JOptionPane.showMessageDialog(null, "El promedio " + promedio + " si se encuentra en la array");
        }else {
            JOptionPane.showMessageDialog(null, "No existe el numero " +  promedio + " en la array");
        }
    }
}
