package com.sofka.tutorial;

//solo  pueden tener un método definido
@FunctionalInterface
public interface Operacion {

    double calcular(double n1, double n2);
}
