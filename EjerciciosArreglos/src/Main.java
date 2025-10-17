import arrays_exercises.*;
import utils.Utiility;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido");
        Scanner sc = new Scanner(System.in);
        int opcion = 0, size = 0;

        do {
            opcion = Utiility.readIntegerPos(Utiility.menu() + "Ingrese una opcion: ");

            if (opcion > 10) {
                JOptionPane.showMessageDialog(null, "Ve algun " + opcion + " como opcion?");
            } else if (opcion == -1) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    ExerciseUno.execute();
                    break;
                case 2:
                    ExerciseDos.execute();
                    break;
                case 3:
                    ExerciseTres.execute();
                    break;
                case 4:
                    ExerciseCuatro.execute();
                    break;
                case 5:
                    ExerciseCinco.execute();
                    break;
                case 6:
                    ExerciseSeis.execute();
                    break;
                case 7:
                    ExerciseSiete.execute();
                    break;
                case 8:
                    ExerciseOcho.execute();
                    break;
                case 9:
                    ExerciseNueve.execute();
                    break;
                case 10:
                    ExerciseDiez.execute();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Hasta Pronto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
            }
        } while (opcion != 0);
    }
}
