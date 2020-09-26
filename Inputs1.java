package com.company;
import java.lang.*;
import java.util.Scanner;

public class Inputs1 {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter num1:");
//        int num1 = in.nextInt();
//        System.out.println("Enter num2:");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum: "+ sum);
        System.out.println("Enter a Number:");
        int it = in.nextInt();
        int c = 0;
        while(it!=0){
            it /= 10;
            c++;
        }
        System.out.println(c);
    }
}
