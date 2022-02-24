package com.sofka.tutorial;

public class MainCarro {
    public static void main(String[] args) {

/*
        Carro c = new Carro();
        c.estado();
        c.encender();

        CarroBMW d = new CarroBMW();
        d.encender();
        d.turbo();
        System.out.println(d.modelo());

        CarroToyota t = new CarroToyota();
        System.out.println( t.modelo());
        */

        Carro c = new CarroBMW();
        c.informacion();

        Carro d = new CarroToyota();
        d.informacion();

        Carro f = new Carro();
        f.informacion();

    }
}
