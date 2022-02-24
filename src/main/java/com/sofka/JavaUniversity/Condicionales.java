package com.sofka.JavaUniversity;

public class Condicionales {
    public static void main(String[] args) {

        var a = 10;
        var valorMaximo = 0;
        var valorMinimo = 10;

        // AND (&&) --> true, true
        var resultado = a >= 0 && a <= 10;

        if(resultado){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera del rango");
        }

        // OR (||) --> true or false
        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso){
            System.out.println("El padre puede asistir al juego");
        }else{
            System.out.println("No puede asistir");
        }
    }
}
