package com.sofka.JavaUniversity;

import java.util.Scanner;

public class OperadoresRelacion {
    public static void main(String[] args) {
        
        var a = 3;
        var b = 2;
        
        // operador de igualdad
        var c = (a == b);
        System.out.println("c = " + c); // false
        
        // diferente a...
        var d = (a != b);
        System.out.println("d = " + d); // true
        
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        
        var e = cadena1 == cadena2; // aquí se compara la referencia de objetos
        System.out.println("e = " + e);
        var f = cadena1.equals(cadena2); // comparamos contenido de cadenas
        System.out.println("f = " + f);
        
        // OPERADORES RELACIONES
        
        var g = a >= b; // mayor que > o mayor o igual >=
        System.out.println("g = " + g);

        if(a % 2 == 0) {
            System.out.println("Es par");
        }
        else{
            System.out.println("Es impar");
        }

        System.out.println("ingrese su edad: ");
        Scanner data1= new Scanner(System.in);
        int edad = Integer.parseInt(data1.nextLine());

        if(edad >= 18){
            System.out.println("eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
