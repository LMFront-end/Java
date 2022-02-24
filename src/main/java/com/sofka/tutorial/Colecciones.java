package com.sofka.tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Colecciones {

    private List<String> lista;

    public void llenarLista(){

        lista = new ArrayList<>();

        lista.add("Lina");
        lista.add("Maria");
        lista.add("Dev14");
    }

    public void usarForEach(){

        //ciclo for 1.7
        /*
        for(String ele: lista){
            System.out.println(ele);
        }
        */

        // forEach 1.8
        //lista.forEach(x -> System.out.println(x));

        // referencias a métodos
        lista.forEach(System.out::println);

    }

    public void usarRemoveIf(){
        // quitar un elemento cuando exista una logica
        // ciclo while
        /*
        for(String elemento: lista){
            Iterator<String> it = lista.iterator();
            while(it.hasNext()){
                if (it.next().equalsIgnoreCase("Lina")){
                    it.remove();
                }
            }
        }
        */
        lista.removeIf(x -> x.equalsIgnoreCase("Lina"));

    }

    public void usarSort(){

        lista.sort((x,y) -> x.compareTo((y)));

    }

    public static void main(String... mitocode) {

        Colecciones app = new Colecciones();
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }
}
