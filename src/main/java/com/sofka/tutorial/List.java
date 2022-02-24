package com.sofka.tutorial;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        LinkedList lista = new LinkedList();

        lista.add("Palabra");
        lista.add(5);
        lista.add(1, 17);

        System.out.println("El tamaño de la lista es: " + lista.size());
        System.out.println(lista.get(0));

    }
}
