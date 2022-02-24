package com.sofka.tutorial;

public class Arreglos {
    public static void main(String[] args) {

        // ARREGLOS

        int x[] = {10,5,7};
        /*
        x[0] = 10;
        x[1] = 5;
        x[2] = 7;
         */
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

        // ARREGLOS BIDIMENSIONALES (MATRICES)
        int j [][];
        j = new int[3][3];

        j[0][0] = 1;
        j[0][1] = 2;
        j[0][2] = 3;
        j[1][0] = 4;
        j[1][1] = 5;
        j[1][2] = 6;
        j[2][0] = 7;
        j[2][1] = 8;
        j[2][2] = 9;

        for(int l = 0; l <3; l++){
            for(int k = 0; k <3; k++){
                System.out.println("j["+l+"] ["+k+"] = " + j[l][k]);
            }
        }

        //System.out.println("[0][2] = " + j[0][2]);

    }
}
