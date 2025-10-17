package arrays_exercises;

import utils.Utiility;

import javax.swing.*;

public class ExerciseDos {
    public static void execute() {
        JOptionPane.showMessageDialog(null,"Bienvenido al ejercicio 2");
        int size = 0, numMayor = 0, indice = 0;
        boolean validador = false;
        do {
            size = Utiility.readIntegerPos("Ingrese la cantidad de numeros: ");
        } while (size < 0);
        int[] usuarios = Utiility.readIntegerArray("Ingrese numero ", size);
        for (int i = 0; i < usuarios.length; i++) {
            validador = Utiility.isPrimeNumber(usuarios[i]);
            if (validador) {
                if (usuarios[i] > numMayor) {
                    numMayor = usuarios[i];
                    indice = i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Numero primo mayor " + numMayor + " esta en el indice " + indice);
    }
}
