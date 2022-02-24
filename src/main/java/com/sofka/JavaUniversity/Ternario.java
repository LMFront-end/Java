package com.sofka.JavaUniversity;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        var resultado = (3 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        System.out.println("Ingresa un numero: ");
        Scanner data2= new Scanner(System.in);
        var numero = Integer.parseInt(data2.nextLine());

        resultado = ((numero % 2) == 0) ? "Par" : "Impar";
        System.out.println("El numero " + numero + " es: " + resultado);
    }
}
