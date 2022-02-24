package com.sofka.project;

import javax.swing.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Welcome to my first program");

        // use Scanner (1)
        Scanner userData = new Scanner(System.in);
        System.out.println("into your name");
        String userName = userData.nextLine();
        System.out.println("Hi " + userName + " Welcome");


    }
}
