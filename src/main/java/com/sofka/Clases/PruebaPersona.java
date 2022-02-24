package com.sofka.Clases;

public class PruebaPersona {
    public static void main(String[] args) {

        // crear objetos a partir de la clase Persona

        // Podemos crear multiples objetos de la clase
        // instancia de clase --> objeto
        Persona persona1 = new Persona();
        persona1.nombre = "Lina María";
        persona1.apellido = "Guerrero";
        persona1.desplegarInformacion();

        Persona persona2 = new Persona();
        persona2.nombre = "Pablo";
        persona2.apellido = "Fontanarosa";
        persona2.desplegarInformacion();
    }
}
