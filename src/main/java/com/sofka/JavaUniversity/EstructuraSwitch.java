package com.sofka.JavaUniversity;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {

        /*
        System.out.println("ingrese un numero del 1 - 4");
        var data = new Scanner(System.in);
        var numero = Integer.parseInt(data.nextLine());

        switch(numero){
            case 1 ->{
                System.out.println("Número uno");
                break;
            }case 2 ->{
                System.out.println("Número dos");
                break;
            }case 3 ->{
                System.out.println("Número tres");
                break;
            }case 4 ->{
                System.out.println("Número cuatro");
                break;
            } default -> {
                System.out.println("Ingrese un numero dentro del rango");
            }
        }

         */

        // Meses del año

        System.out.println("1.Enero, 2.Febrero, 3.Marzo, 4.Abril, 5.Mayo, 6.Junio, 7.Julio, 8.Agosto, 9.Septiembre, 10.Octubre, 11.Noviembre, 12.Diciembre");
        System.out.println("Elige mes del año: ");
        var estacion = new Scanner(System.in);
        var mes = Integer.parseInt(estacion.nextLine());
        var estacionMes = "Estacion no encontrada";

        switch(mes){
            case 1:
            case 2:
            case 12:{
                estacionMes = "Invierno";
                break;
            }
            case 3:
            case 4:
            case 5:{
                estacionMes = "Primavera";
                break;
            }
            case 6:
            case 7:
            case 8:{
                estacionMes = "Verano";
                break;
            }
            case 9:
            case 10:
            case 11:{
                estacionMes = "Otonio";
                break;
            }
        }

        System.out.println("estacion = " + estacionMes);
    }
}
