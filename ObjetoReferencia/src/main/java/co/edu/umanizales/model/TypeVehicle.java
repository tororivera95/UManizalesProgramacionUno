package co.edu.umanizales.model;

public class TypeVehicle {

    private String code;
    private String description;
    
    public TypeVehicle(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public TypeVehicle() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
        
}
