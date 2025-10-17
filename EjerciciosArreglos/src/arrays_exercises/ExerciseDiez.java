package arrays_exercises;

import model.Student;
import utils.Utiility;
import utils.UtilityStudent;

import javax.swing.*;

public class ExerciseDiez {
    public static void execute() {
        JOptionPane.showMessageDialog(null, "Bienvenido al ejercicio 10");
        int index = 0, cedula = 0;
        byte sexo = 0;
        double sueldo = 0;
        boolean trabaja = false;

        index = Utiility.readIntegerPos("Ingrese cantida de estudiantes: ");

        Student[] student = new Student[index];
        for (int i = 0; i < student.length; i++) {
            cedula = Utiility.readIntegerPos("Ingrese su cedula: ");
            sexo = Utiility.readByteGenerPos("Elija el sexo 1. Hombre 2. Mujer");
            if (Utiility.readByteGenerPos("Elija una opcion 1. Si trabaja 2. No trabaja") == 1) {
                trabaja = true;
                sueldo = Utiility.readValidateSalary("Ingrese su sueldo: ");
            } else {
                trabaja = false;
                sueldo = 0;
            }
            student[i] = new Student(cedula, sexo, sueldo, trabaja);
        }
        JOptionPane.showMessageDialog(null,
                String.format(
                        "Porcentaje de hombres es de: %.1f%%\n"
                                + "Porcentaje de mujeres es de: %.1f%%\n"
                                + "Porcentaje de hombres que trabajan: %.1f%%\n"
                                + "Promedio sueldo en hombres: $%,.0f\n"
                                + "Porcentaje de mujeres que trabajan: %.1f%%\n"
                                + "Promedio sueldo en mujeres: $%,.0f\n",
                        UtilityStudent.porcentajeHombres(student),
                        UtilityStudent.porcentajeMujeres(student),
                        UtilityStudent.porcHombresTrabajan(student),
                        UtilityStudent.porcHombresSueldo(student),
                        UtilityStudent.porcMujeresTrabajan(student),
                        UtilityStudent.porcMujeresSueldo(student)
                ));
    }
}
