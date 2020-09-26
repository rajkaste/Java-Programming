package com.company;

import java.util.Scanner;

public class inputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i=0;i< values.length;i++){
            values[i] = sc.nextInt();
        }
        for (int j:values){
            System.out.print(j+" ");
        }
    }
}
