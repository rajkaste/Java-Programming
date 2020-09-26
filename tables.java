package com.company;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table's no. you want to Print: ");
        int input = sc.nextInt();

        for (int i=1;i<11;i++){
            System.out.println(input+" x "+i+" = "+input*i);
        }

    }
}
