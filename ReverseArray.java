package com.company;

import java.util.Scanner;

public class ReverseArray {

     static void reverse(int[] arr, int s){
        int temp;
        for(int i = 0 ; i < (s/2) ; i++){
            temp = arr[i];
            arr[i] = arr[s-i-1];
            arr[s-i-1] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
      reverse(arr,size);

        for (int el:arr) {
            System.out.print(el+" ");
        }
//        int count=0;
//        for(int i = 0;i < arr.length;i++){
//            if (arr[i]>0) {
//                count++;
//            }
//        }
//        System.out.println("There are total "+count+" positive nos. in the array.");


    }
}
