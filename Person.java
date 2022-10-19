package com.company;

public class Person {


//Method Overloading
//If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

    void displayAge(){
        System.out.println("My age is 20");
    }

    void displayAge(int age){
        System.out.println("My age is "+age);
    }

    void displayAge(double age){
        System.out.println("My age is "+age);
    }




}
