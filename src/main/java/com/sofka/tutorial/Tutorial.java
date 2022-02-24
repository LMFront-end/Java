package com.sofka.tutorial;

import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {

        //Conversion de tipos

        // Convertir un tipo String a int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));

        //pedir un valor
        /*
        var consola =  new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");

        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad: " + edad + " años");
0        */

        // de int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(2);
        System.out.println("caracter = " + caracter);

        System.out.println("Ingresa un caracter: ");
        var consola =  new Scanner(System.in);
        caracter = consola.nextLine().charAt(0);
        System.out.println("Primer caracter = " + caracter);





    }
}
