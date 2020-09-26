package com.company;

import java.util.Scanner;

public class StringInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
//        s = sc.next(); i/p: Raj Kaste | o/p: Raj
        s = sc.nextLine();
        //i/p: Raj Kaste
        System.out.println(s);
        //o/p: Raj Kaste
    }
}
