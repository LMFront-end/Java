package com.sofka.tutorial;

import java.util.Arrays;
import java.util.Comparator;

public class MiRefApp {

    public static void referenciarMetodoStatic(){
        System.out.println("Método Referido static");
    }

    public void referenciarMetodoInstaciaObjetoArbitrario(){
        String[] nombres = {"Mito", "Code", "Lina"};

        /*
        Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
         */

        // Expresión lambda (1)

        //Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //System.out.println(Arrays.toString(nombres));

        Arrays.sort(nombres, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));

    }

    public void referenciarMetodoInstaciaObjetoParticular(){
        System.out.println("Método Referido Instacia de un objeto en particular");
    }

    public void referenciarConstructor(){

    }

    public void operar(){
        OperacionDos op = () -> MiRefApp.referenciarMetodoStatic();
        op.saludar();
    }

    public static void main(String[] args) {
        MiRefApp app = new MiRefApp();
        //app.operar();
        //app.referenciarMetodoInstaciaObjetoArbitrario();
        OperacionDos op = app::referenciarMetodoInstaciaObjetoParticular;
        op.saludar();

    }
}
