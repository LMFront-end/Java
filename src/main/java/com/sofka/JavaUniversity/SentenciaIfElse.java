package com.sofka.JavaUniversity;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        var condicion = true;

        if(condicion) {
            System.out.println("Es verdadera");
        }else{
            System.out.println("Es falsa");
        }

        System.out.println("Ingresa un numero del 1 al 4: ");
        var data = new Scanner(System.in);
        var numero = Integer.parseInt(data.nextLine());
        var numeroTexto = "Número no encontrado";


        if(numero == 1){
            numeroTexto = "Número uno";
        }else if(numero == 2){
            numeroTexto = "Número dos";
        }else if(numero == 3){
            numeroTexto = "Número tres";
        }else if(numero == 4){
            numeroTexto = "Número cuatro";
        }else{
            numeroTexto = "Número no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);

        // CALCULO ESTACIÓN DEL AÑO
        System.out.println("1.Enero, 2.Febrero, 3.Marzo, 4.Abril, 5.Mayo, 6.Junio, 7.Julio, 8.Agosto, 9.Septiembre, " +
                "10.Octubre, 11.Noviembre, 12.Diciembre");
        System.out.println("Elige mes del año: ");
        var estacion = new Scanner(System.in);
        var mes = Integer.parseInt(estacion.nextLine());
        var estacionMes = "Estacion no encontrada";

        if(mes == 1 || mes == 2 || mes == 12){
            estacionMes = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacionMes = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacionMes = "Verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacionMes = "Otonio";
        }

        System.out.println("estación = " + estacionMes);
    }
}
