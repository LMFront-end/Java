package com.sofka.tutorial;

// HERENCIA

class CarroBMW extends Carro {

    public CarroBMW() {
        this.modelo = "BMW";
    }

    public void informacion(){
        System.out.println("Este es un BMW del año 2011");
    }

    public void turbo(){
        System.out.println("Acabas de viajar a 100 millas por hora!");
    }
}
