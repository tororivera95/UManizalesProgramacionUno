package utils;

import model.Student;

public class UtilityStudent {

    public static int cantHombres(Student[] student){
        int cont =0;
        for (Student s : student){
            if (s.getSexo()==1){
                cont++;
            }
        }
        return cont;
    }

    public static int cantMujeres(Student[] student){
        int cont =0;
        for (Student s : student){
            if (s.getSexo()==2){
                cont++;
            }
        }
        return cont;
    }

    public static double porcentajeHombres(Student[] student) {
        int cont = 0;
        double promedio = 0;
        cont = cantHombres(student);
        promedio = (double) cont / student.length * 100;
        return promedio;
    }

    public static double porcentajeMujeres(Student[] student) {
        int cont = 0;
        double promedio = 0;
        cont = cantMujeres(student);
        promedio = (double) cont / student.length * 100;
        return promedio;
    }

    public static double porcHombresTrabajan(Student[] student) {
        int cont = 0, cantEstud;
        double promedio = 0;
        cantEstud = cantHombres(student);
        for (Student s : student) {
            if (s.isTrabaja()&& s.getSexo() == 2) {
                cont++;
            }
        }
        promedio = (double) cont / cantEstud * 100;
        return promedio;
    }

    public static double porcMujeresTrabajan(Student[] student) {
        int cont = 0, cantEstud;
        double promedio = 0;
        cantEstud = cantMujeres(student);
        for (Student s : student) {
            if (s.isTrabaja() && s.getSexo() == 2) {
                cont++;
            }
        }
        promedio = (double) cont / cantEstud * 100;
        return promedio;
    }

    public static double porcMujeresSueldo(Student[] student) {
        int cantEstud;
        double promedio = 0, cont = 0;
        cantEstud = cantMujeres(student);
        for (Student s : student) {
            if (s.isTrabaja()) {
                cont = cont + s.getSueldo();
            }
        }
        promedio = (double) cont / cantEstud * 100;
        return promedio;
    }

    public static double porcHombresSueldo(Student[] student) {
        int cantEstud;
        double promedio = 0, cont = 0;
        cantEstud = cantHombres(student);
        for (Student s : student) {
            if (s.isTrabaja()) {
                cont = cont + s.getSueldo();
            }
        }
        promedio = (double) cont / cantEstud * 100;
        return promedio;
    }
}
