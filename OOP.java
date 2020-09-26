package com.company;

public class OOP{
    public static void main(String[] args) {
/*
Object Creation:-

        //creating object1
        Student raj = new Student();
        raj.id = 64;
        raj.marks = 9.07;
        System.out.println(raj.id);
        System.out.println(raj.marks);

        //creating object2
        Student ankit = new Student();
        ankit.id = 77;
        ankit.marks = 8.5;
        System.out.println(ankit.id);
        System.out.println(ankit.marks);

 */
//------------------------------------------------------
/*
//Implementing Class Method:-

        double raj_marks = 0, ankit_marks = 0;

        Student raj = new Student();
        raj.id = 64;
        raj.phy = 94;
        raj.chem = 100;
        raj.maths = 88;
        //raj.percentage();
        raj_marks = raj.percentage();
        System.out.println(raj_marks);

        Student ankit = new Student();
        ankit.id = 77;
        ankit.phy = 92;
        ankit.chem = 96;
        ankit.maths = 75;
        //ankit.percentage();
        ankit_marks = ankit.percentage();
        System.out.println(ankit_marks);
*/

//--------------------------------------------------------
// Designing Class Methods Which Accept Parameters:-
/*
        double raj_marks = 0;
        int sum = 0;
        Student raj = new Student();
        raj.id = 64;
        raj.phy = 94;
        raj.chem = 100;
        raj.maths = 88;
        //raj.percentage();

        sum = raj.total_sum();
        System.out.println(sum);

        raj_marks = raj.percentage(sum);
        System.out.println(raj_marks);
*/
//---------------------------------------------------------
//Constructors:-(Parameterized,Overloading)
/*
    Student raj = new Student(1,60,55,55);
        System.out.println(raj.chem);

    Student ankit = new Student(2,55,50,45);
        System.out.println(ankit.id);
*/
  //  Student akash = new Student();

//----------------------------------------------------------

//Overloading a Class Method:-
/*
    Person p = new Person();
    p.displayAge(21.5);
*/
/*
        Multiply num = new Multiply();
        num.multi(10,20);
        num.multi(10,20,10);
        num.multi(10,20,15,20);
        num.multi(6,5);
*/
//----------------------------------------------------------
//Passing Objects as Parameter:-


    Rectangle r = new Rectangle();
    CalRecArea a = new CalRecArea();
    a.cal(r);



    }
}

