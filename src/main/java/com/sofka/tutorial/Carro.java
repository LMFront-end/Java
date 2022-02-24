package com.sofka.tutorial;

public class Carro {
    // variables nativas de la clase
    double peso;
    double altura;
    double ancho;
    double largo;
    double numeroPuertas;
    String modelo;
    boolean encendido = false;

    //constructores

    public Carro(){
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 120;
    }

    public String modelo(){
        return this.modelo;
    }

    public double obternerPeso(){
        return this.peso;
    }

    public void encender(){
        this.encendido = true;
        System.out.println("El carro está encendido");
    }

    public void apagar(){
        this.encendido = false;
        System.out.println("El carro esta apagado");
    }

    public void estado(){
        if(this.encendido == true){
            System.out.println("El carro esta encendido");
        }else{
            System.out.println("El carro esta apagado");
        }

    }
    // POLIMORFISMO

    public void informacion(){
        System.out.println("Este es un comun y corriente");
    }

    }


