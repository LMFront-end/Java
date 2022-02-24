package com.sofka.pasoporvalor;

import com.sofka.Clases.Persona;

public class PasoPorReferencia {

    // paso por referencia
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.nombre = "Mateo";
        persona1.apellido = "Vlad";

        System.out.println(persona1.nombre);
        cambioValor(persona1);
        System.out.println(persona1.nombre);
    }

    public static void cambioValor(Persona persona){

        persona.nombre = "Santiago";

    }
}
