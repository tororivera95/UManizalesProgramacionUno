package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseTres {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 3");
        int numMin, numMax, index;

        do {
            index = Utiility.readIntegerPos("Ingrese cantidad de numeros primos almacenar");
            numMin = Utiility.readIntegerPos("Ingrese valor minimo");
            numMax = Utiility.readIntegerPos("Ingrese valor maximo");
            if (index <= 0) {
                JOptionPane.showMessageDialog(null, "El valor index debe de ser mayor a cero");
            }
            if (numMax < numMin) {
                JOptionPane.showMessageDialog(null, "El valor minimo no puede ser mayor al valor maximo");
            }
        } while (numMax < numMin || index <= 0);

        int[] cantiPrime = new int[index];
        if (numMax > numMin) {
            cantiPrime = Utiility.primesInRange(numMin, numMax, index);
        } else {
            cantiPrime = Utiility.primesInRange(numMax, numMin, index);
        }
        for (int num : cantiPrime) {
            JOptionPane.showMessageDialog(null, "Numero primo " + num);
        }
    }
}
