package model;

public class Student {

    private int cedula;
    private byte sexo;
    private double sueldo;
    private boolean trabaja;

    public Student(int cedula, byte sexo, double sueldo, boolean trabaja) {
        this.cedula = cedula;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.trabaja = trabaja;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isTrabaja() {
        return trabaja;
    }

    public void setTrabaja(boolean trabaja) {
        this.trabaja = trabaja;
    }
}
