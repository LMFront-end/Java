package com.sofka.tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;

public class VariablesTexto {

    /*
    * @params args
    * Leer desde el teclado
    * concat()
    * toUpperCase()
    * toLowerCase()
    * lenght()
    * Convertir variables numericas a String y viceversa
    * */

    public static void main(String[] args) {
        String texto = "";

        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);


        try{
            texto = buffer.readLine();
        }catch (IOException e){};

        texto = texto.concat("-esto es una CONCATENACIÓN");
        // de mayúsculas a minúsculas
        texto = texto.toLowerCase();

        // de minúsculas a mayusculas
        texto = texto.toUpperCase();

        System.out.println(texto);

    }
}

