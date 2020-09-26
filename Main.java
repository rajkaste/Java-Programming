package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//      Student s = new Student();
//        s.displayName();
       // Student.displayName(); //using a static method

//        final int a = 30;
//        //a = 100;
//        System.out.println(a);

        //Inheritance
        Child c = new Child();
        System.out.println(c.wealth);
        c.disSurname();
        System.out.println(c.age);
        System.out.println(c.contact);

    }
}
