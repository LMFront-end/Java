package com.sofka.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        * Enter the following data
        * userName
        * phone
        * age
        * */

        // UserName
        System.out.println("Enter your full name: ");
        Scanner data1= new Scanner(System.in);
        var userName = data1.nextLine();

        // Phone
        System.out.println("Enter your number phone: ");
        Scanner data2= new Scanner(System.in);
        var userPhone = data2.nextLine();

        //age
        System.out.println("Enter your age: ");
        Scanner data3= new Scanner(System.in);
        var userAge = data3.nextLine();

        // Message

        System.out.println("Welcome Mr/Mrs: " + userName + " it's a pleasure for us to have a person of " + userAge + " years \n." +  "We will contact you soon at " + userPhone + ". \n" + "Happy day to you!");




    }
}
