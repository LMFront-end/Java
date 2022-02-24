package com.sofka.tutorial;

import java.util.Optional;

public class Opcional {

    public void probar(String valor){
        //System.out.println(valor.contains("Lina"));

        try{
            Optional op = Optional.empty();
            op.get();
        }catch (Exception e){
            System.out.println("No hay elemento");
        }
    }

    public void orElse(String valor){

        Optional<String> op = Optional.ofNullable(valor);
        //String x = op.get();
        String x = op.orElse("Predeterminado");
        System.out.println("x = " + x);

    }

    public void orElseThrow(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NullPointerException::new);

    }

    public void isPresent(String valor){
        Optional<String> op = Optional.ofNullable(valor);
        System.out.println(op.isPresent());

    }

    public static void main(String[] args) {
        Opcional app = new Opcional();
        //app.probar(null);
        app.orElse("Lina");
    }
}
