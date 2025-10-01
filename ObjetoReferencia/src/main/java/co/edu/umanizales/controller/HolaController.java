package co.edu.umanizales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.umanizales.model.Color;
import co.edu.umanizales.model.TypeVehicle;

@RestController
public class HolaController {

    @GetMapping("/")
    public String saludar() {
        return "Hola Mundo desde la UManizales 🚀";
    }

    @GetMapping("/colors")
    public String colores() {

        Color red = new Color();
        red.code = 1;
        red.description = "Red";

        Color green = new Color();
        green.code = 2;
        green.description = "Green";

        Color blue = new Color();
        blue.code = 3;
        blue.description = "Blue";

        Color[] colors = { red, green, blue };

        String resultado = colors[0].code + " " + colors[0].description + "<br>"
                + colors[1].code + " " + colors[1].description + "<br>"
                + colors[2].code + " " + colors[2].description;

        return resultado;
    }

    @GetMapping("/typeVehicle")
    public String typeVehicle() {

        TypeVehicle typeVehicle1 = new TypeVehicle();
        typeVehicle1.setCode("1");
        typeVehicle1.setDescription("Mercedez");

        TypeVehicle typeVehicle2 = new TypeVehicle();
        typeVehicle2.setCode("2");
        typeVehicle2.setDescription("Skoda");

        String resultado = typeVehicle1.getCode() + " " + typeVehicle1.getDescription() + "<br>"
                + typeVehicle2.getCode() + " " + typeVehicle2.getDescription();

        return resultado;
    }

}
