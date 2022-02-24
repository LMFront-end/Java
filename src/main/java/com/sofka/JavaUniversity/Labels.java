package com.sofka.JavaUniversity;

public class Labels {
    public static void main(String[] args) {

        inicio:
        for (int i = 0; i < 10; i++){
            if(i % 2 != 0){
                continue inicio; // ir a la línea de código de la etiqueta que hemos agregado
            }

            System.out.println("i = " + i);
        }
    }
}
