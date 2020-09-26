package com.company;

class GNStudent{
    int phy = 70;
    int chem = 89;
    void displayMarks(){
        System.out.println("Physics: "+phy);
        System.out.println("Chemistry: "+chem);
    }
}
class BioStudents extends GNStudent{
    int bio = 90;
    void disBio(){
        System.out.println("Biology: "+bio);
    }
}


public class InheritanceExample {
    public static void main(String[] args) {
        BioStudents bs = new BioStudents();
        bs.displayMarks();
        bs.disBio();
        GNStudent gs = new GNStudent();
        gs.displayMarks();
    }
}
/*
op:
        Physics: 70
        Chemistry: 89
        Biology: 90
        Physics: 70
        Chemistry: 89
*/