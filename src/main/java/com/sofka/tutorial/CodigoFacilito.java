package com.sofka.tutorial;

/*
public class CodigoFacilito {

    public static void main(String[] args) {
        // Primer hola mundo
        System.out.println("Hola Mundo, desde código facilito");

        // Variables y operaciones aritméticas
        /* Variables
        * short → números cortos
        * int → números enteros
        * long ⇾ números enteros largos
        * float -⇾ números flotantes
        * double --> números dobles
        * byte --> se maneja en bytes
        * char --> caracteres
        * boolean --> booleanos, (falso, verdadero)
        * String --> cadenas de texto
        *
        * OPERADORES ARITMÉTICOS
        * + -, *, %, /
        *
        
        int variable1;
        variable1 = 2;
        int resultado = variable1 * 4;
        System.out.println("resultado = " + resultado);
        //System.out.println("variable1 = " + variable1);

        // Operación compleja
        short suma;
        suma = 3 + 10;
        int resta = 8 - 17;
        long residuo = 9/2;
        float multiplicacion = 2*(15*(-2));
        double division = 10/3.4;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es: " + division);
        System.out.println("El residuo de la división es: " + residuo);


    }
}
*/

public class CodigoFacilito{
    public static void main(String[] args) {
        // Sentencia if/else
        // >, <, <=, >=, ==, ||, &&, !

        var edad = 18;
        var condicion = edad >=18;

        if(condicion){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

        // Instrucción FOR
        // incremento
        /*
        for(int i = 0; i <= 10;  i++){
            System.out.println("#" + i);
        }
        */
        // decremento
        /*
        for(int j = 10;  j >= 0; j--){
            System.out.println(j);
        }
         */
        // de dos en dos
        /*
        for(int i = 0; i <= 10;  i++){
            i = i * 2;
            System.out.println("#" + i);
        }
         */

        // Instrucción while
        /*
        int x = 0;
        while(x <= 10){
            System.out.println("El valor de X es: " + x);
            x = x + 2;
        }
         */

        // INSTRUCCIÓN BREAK Y CONTINUE
        // break --> salir
        // continue -> continuar

        for(int i =0; i <= 10; i++){
            System.out.println("Aun estas en el ciclo for");

            if(i == 4){
                //break;
                continue;
            }
            System.out.println("El valor de la i es: " + i);
        }
        System.out.println("Has salido del ciclo for");
    }
}
