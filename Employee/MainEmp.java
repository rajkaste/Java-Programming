import java.util.ArrayList;

import static java.util.Comparator.comparing;

public class MainEmp {
    public static void main(String[] args) {
        Employee ep1 = new Employee("Harish",50000);
        ep1.getGrosssalary();
        Employee ep2 = new Employee("Raj",60000);
        ep2.getGrosssalary();
        Employee ep3 = new Employee("Mubin",70000);
        ep3.getGrosssalary();
        Employee ep4 = new Employee("Priyesh",65000);
        ep4.getGrosssalary();
        Employee ep5 = new Employee("Nikhil",50000);
        ep5.getGrosssalary();
        Employee ep6 = new Employee("Akash",40000);
        ep6.getGrosssalary();
        Employee ep7 = new Employee("Shrirang",60000);
        ep7.getGrosssalary();
        Employee ep8 = new Employee("Anand",50000);
        ep8.getGrosssalary();
        Employee ep9 = new Employee("Aditya",55000);
        ep9.getGrosssalary();
        Employee ep10 = new Employee("Vishal",45000);
        ep10.getGrosssalary();

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(ep1);
        emp.add(ep2);
        emp.add(ep3);
        emp.add(ep4);
        emp.add(ep5);
        emp.add(ep6);
        emp.add(ep7);
        emp.add(ep8);
        emp.add(ep9);
        emp.add(ep10);

        //sort gross salary in descending order
        emp.sort(comparing(Employee::getGrosssalary).reversed());

        System.out.println("Employee Detail:\n");
        for(Employee e: emp )
        {
            System.out.println("Employee Name: " +e.name);
            System.out.println("Employee Basic Salary: " +e.basicsalary);
            System.out.println("Employee Gross Salary: " +e.grosssalary);
            System.out.println("********************************************");
        }
    }

}
