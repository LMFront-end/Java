package com.sofka.tutorial;

import java.util.ArrayList;
import java.util.List;

public class StreamParalelo {

    private List<Integer> numeros;

    public void llenar(){

        numeros = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numeros.add(i);
        }
    }

    public void probarStream(){
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo(){
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) throws InterruptedException{
        StreamParalelo app = new StreamParalelo();

        app.llenar();
        //app.probarStream();
        //numeros aleatorios
        app.probarParalelo();
    }
}
