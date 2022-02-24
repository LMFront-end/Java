package com.sofka.JavaUniversity;

public class OperadorUnario {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;

        System.out.println(c);
        System.out.println(d);

        //Incremento
        //1. Preincremento (símbolo antes de la variable)

        var e = 3;
        var f = ++e; // primero se incrementa la variable y después se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        //2. postincremento (símbolo después de la variable)
        var g = 5;
        var h = g++; // primero se utiliza el valor y después se incrementa
        System.out.println("g = " + g); // tenemos pendiente un incremento
        System.out.println("h = " + h);


        // Decremento
        //1. pre decremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); // ya está decrementada
        System.out.println("j = " + j);

        // 2. pos decremento

        var k = 4;
        var l = k--; // primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
