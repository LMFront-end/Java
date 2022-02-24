package com.sofka.tutorial;

/*
public class SeriesYNumeros {
    public static void main(String[] args) {
        // Algoritmos cíclicos

        // Series de Fibonacci
        int x = 1;
        int anterior = 0;
        int temp;
        do {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;

        } while (x <= 30);

        // Serie de números impares
        /*
        for(int i = 1; i <= 100; i++){
            if((i % 2) != 0){
                System.out.println(i);
            }
        }

    }
}
*/


public class Series{
    public static void main(String[] args) {
        // Switch Case (Funciona con caracteres y con enteros)
        
        int x;
        x = 2;

        switch (x) {
            case 0 -> {
                System.out.println("Esta es la opción 0");
                break;
            }
            case 1 -> {
                System.out.println("Esta es la opción 1");
                break;
            }
            default -> {
                System.out.println("Opción invalida");
            }
        }


    }


}