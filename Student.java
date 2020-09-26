package com.company;

public class Student {
    private int id;
    double marks;
    private int phy,chem,maths;

    //constructor
    Student(int id,int phy,int chem, int maths){
        this.id = id;
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
        System.out.println("Parameterized Constructor Called.");
    }

    Student() {
        id =1;
        phy=100;
        chem=100;
        maths=100;
        System.out.println("Normal Constructor Called.");
    }


//    void percentage(){
//        System.out.println((phy+chem+maths)/3.0);
//    }

    double percentage(int tsum){
        return((tsum)/3.0);
    }

    int total_sum(){
        return(phy+chem+maths);
    }

    public static void displayName(){
        System.out.println("this is a display method");
    }

}

