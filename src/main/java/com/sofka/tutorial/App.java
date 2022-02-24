package com.sofka.tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {

    private Map <Integer, String> map;

    public void poblar(){
        map = new HashMap<>();
        map.put(1, "Lina");
        map.put(2, "Maria");
        map.put(3, "Dev14");
    }

    public void imprimir_v7(){
        for(Entry<Integer, String> e : map.entrySet()){
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public void imprimir_v8(){
        //map.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void recolectar(){
        Map<Integer, String> mapaReconlectar = map.entrySet().stream().filter(e -> e.getValue().contains("M"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        mapaReconlectar.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }

    public void insertarSiAusente(){
        // agregar un valor que no se encuentra
        // no sobrescribe un valor
        map.putIfAbsent(4, "Mateo");
    }

    public void operarSiPresente(){
        map.computeIfPresent(3, (k,v) -> k + v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado(){
        String valor = map.getOrDefault(5, "Valor por defecto");
        System.out.println(valor);
    }

    public static void main(String[] args) {
        App app = new App();
        app.poblar();
        //app.imprimir_v7();
        //app.insertarSiAusente();
        //app.operarSiPresente();
        app.obtenerOrPredeterminado();
        //app.imprimir_v8();
        app.recolectar();
    }
}
