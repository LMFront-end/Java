package com.sofka.JavaUniversity;

public class Ciclos {
    public static void main(String[] args) {

        // WHILE
        /*
        var contador = 0;

        while(contador < 3){
            System.out.println("contador = " + contador);
            contador ++;
        }
        */

        // DO WHILE

        /*
        var contador1 = 0;
        do {
            System.out.println("contador = " + contador1);
            contador1 ++;
        }
        while(contador1 < 3);
        */

        // CICLO FOR
        // BREAK Y CONTINUE

        /*
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                System.out.println("i = " + i);
                // Rompe el ciclo que se está ejectando
                break;
            }
        }
        */

        for(var contador = 0; contador <= 10; contador++) {
            if(contador % 2 != 0){
                continue; // ir a la siguiente iteración
            }
            System.out.println("contador = " + contador);
        }


    }
}
