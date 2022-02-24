package com.sofka.tutorial;

public class Operadores {
    public static void main(String[] args) {
        /*
        * Operadores aritméticos (+,-,*,/,%)
        * Operadores de relación (<, >, <=,>=, !=, ==)
        * Operadores lógicos (&& o &, || o |, !, ^)
        * Operadores unitarios (~, -)
        * */

        // para declarar multiples variables debemos declarar int
        int a,b;
        a = 3;
        b = 2;

        // suma
        var resultado = a + b;
        System.out.println("La suma es igual a = " + resultado);

        // resta
        resultado = a - b;
        System.out.println("La resta es igual a = " + resultado);

        // multiplicación
        resultado = a * b;
        System.out.println("La multiplicación es igual a = " + resultado);

        // división
        resultado = a / b;
        System.out.println("La división es igual a = " + resultado);

        // modulo
        resultado = a % b;
        System.out.println("Modulo es igual a = " + resultado);

    }
}
