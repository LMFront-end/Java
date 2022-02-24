package com.sofka.tutorial;
import com.sofka.tutorial.Pelota;

public class Objetos {
    public static void main(String[] args) {

        Pelota p;
        p = new Pelota();

        p.patearPelota();

        float var = p.obtenerPeso();
        System.out.println("La pelota pesa: " + var);
        
        float var2 = p.obtenerRadio();
        System.out.println("var2 = " + var2);
    }
}
