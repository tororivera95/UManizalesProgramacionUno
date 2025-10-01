import java.util.Scanner;

public class EjercicioDiez {
    public void respuestaEjercicioDiez() {
        /*
         * 10. Con base en una encuesta realizada a N estudiantes (N<=50) en una
         * Universidad donde se solicitó la
         * siguiente información: CÉDULA, SEXO, SUELDO, TRABAJA. Donde:
         * 
         * -CEDULA
         * -SEXO (1 - Masculino 2 – Femenino)
         * -TRABAJA (1 - Si trabaja 2 - No trabaja)
         * -SUELDO (Es un valor entero)
         * Escriba el algoritmo que permita leer y almacenar en arreglos los datos
         * solicitados, luego, calcular e imprimir:
         * -Porcentaje de hombres en la Universidad
         * -Porcentaje de mujeres en la Universidad
         * -Porcentaje de hombres que trabajan y sueldo promedio
         * -Porcentaje de mujeres que trabajan y sueldo promedio
         */

        int[] cedula = new int[5], sexo = new int[5], trabaja = new int[5], sueldo = new int[5];
        int hombres = 0, mujeres = 0, hombresTrabajan = 0, mujeresTrabajan = 0, sueldoHombres = 0, sueldoMujeres = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese la cedula: ");
            cedula[i] = scanner.nextInt();

            System.out.println("Ingrese el sexo 1-Masculino 2-Femenino: ");
            sexo[i] = scanner.nextInt();
            if (sexo[i] == 1) { // Total hombres y mujeres
                hombres++;
            } else {
                mujeres++;
            }

            System.out.println("Ingrese si trabaja 1-Si 2-No: ");
            trabaja[i] = scanner.nextInt();
            System.out.println("Ingrese el sueldo: ");
            sueldo[i] = scanner.nextInt();

            if (trabaja[i] == 1 && sexo[i] == 1) { // Total hombres y mujeres que trabajan y sueldo promedio
                hombresTrabajan++;
                sueldoHombres += sueldo[i];
            } else if (trabaja[i] == 1 && sexo[i] == 2) {
                mujeresTrabajan++;
                sueldoMujeres += sueldo[i];
            }
        }

        // Porcentaje de hombres y mujeres
        double porcentajeHombres = Double.valueOf(hombres) / 50 * 100;
        double porcentajeMujeres = Double.valueOf(mujeres) / 50 * 100;

        // Porcentaje de hombres y mujeres que trabajan
        double porcentajeHombresTrabajan = Double.valueOf(hombresTrabajan) / 50 * 100;
        double porcentajeMujeresTrabajan = Double.valueOf(mujeresTrabajan) / 50 * 100;

        // Promedio de sueldo de hombres y mujeres que trabajan
        double promedioHombres = Double.valueOf(sueldoHombres) / hombresTrabajan;
        double promedioMujeres = Double.valueOf(sueldoMujeres) / mujeresTrabajan;

        System.out.println("Porcentaje de hombres en la Universidad: " + porcentajeHombres
                + " %\nPorcentaje de mujeres en la Universidad: " + porcentajeMujeres
                + " %\nPorcentaje de hombres que trabajan: " + porcentajeHombresTrabajan
                + " %\nPorcentaje de mujeres que trabajan: " + porcentajeMujeresTrabajan
                + " %\nPromedio de sueldo de hombres que trabajan: " + promedioHombres
                + "\nPromedio de sueldo de mujeres que trabajan: " + promedioMujeres);
    }
}
