package com.sofka.JavaUniversity;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b = 2;
        // Se evalúa de izquierda a derecha
        int c = a + 5 - b;

        System.out.println(c);

        // incrementar variable (*, +, +. /, %)
        a += 1; // a = a + 1
        System.out.println("a = " + a);
    }
}
