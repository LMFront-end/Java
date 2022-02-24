package com.sofka.JavaUniversity;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        System.out.println("Bienvenido a las tablas de multiplicar");
        System.out.println("Introduce numero entero: ");
        var data = new Scanner(System.in);
        var numero = data.nextInt();
        System.out.println("Tabla del " + numero);
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
