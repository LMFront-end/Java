package com.sofka.Textos;

import java.io.BufferedReader;
import java.io.FileReader;

public class Textos {

    public void leer(String nombreArchivo){

        try {

            FileReader r = new FileReader(nombreArchivo);
            //espacio en memoria para guardar información
            BufferedReader buffer = new BufferedReader(r);

            System.out.println(buffer.readLine());

            String temp = "";

            while(temp != null){

                temp = buffer.readLine();
                if(temp == null)
                    break;
                System.out.println(temp);
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
