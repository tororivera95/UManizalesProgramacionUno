package co.edu.umanizales.model;

public class Vehicle {

    private String type;
    private Color color;
    private Short cilindraje;
    private TypeVehicle typeVehicle;

    public Vehicle(String type, Color color, Short cilindraje, TypeVehicle typeVehicle) {
        this.type = type;
        this.color = color;
        this.cilindraje = cilindraje;
        this.typeVehicle = typeVehicle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Short getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(Short cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TypeVehicle getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(TypeVehicle typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

}