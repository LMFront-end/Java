package com.sofka.Clases;

public class Persona {

    // ATRIBUTOS DE LA CLASE
    public String nombre;
    public String apellido;

    // MÉTODOS DE LA CLASE
    // Valores (argumentos)
    // Para utilizar fuera de esta clase
    public void desplegarInformacion(){
        //cuerpo del método
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
