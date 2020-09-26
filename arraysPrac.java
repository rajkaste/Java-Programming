package com.company;

import java.util.Scanner;

public class arraysPrac {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] score = new int[5];
        int i,sum=0;

        for (i=0;i<score.length;i++){
            score[i] = in.nextInt();
            sum += score[i];
        }
//         for (i =0;i<score.length;i++){
//             System.out.print(score[i]+" ");
//         }
        System.out.println(sum);
    }
}
