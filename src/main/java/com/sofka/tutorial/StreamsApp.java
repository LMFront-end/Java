package com.sofka.tutorial;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Lina");
        lista.add("María");
        lista.add("Mateo");
        lista.add("MitoCode");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    // filtrar
    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    // ordenar
    public void ordenar() {
        // forma ascendente
        //lista.stream().sorted().forEach(System.out::println);

        //forma descendente
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    //transformar
    public void transformar() {
        // transformar los elementos de la colección 1 a 1
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);
        
        //números
        /*
        for(String x : numeros){
            int num = Integer.parseInt(x) + 1;
            System.out.println("num = " + num);
        }
        */

        numeros.stream().map((x -> Integer.parseInt(x) + 1)).forEach(System.out::println);
        
    }

    //limitar
    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }

    // contar
    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filter();
        app.ordenar();
        app.transformar();
        app.limitar();
        app.contar();
    }
}
