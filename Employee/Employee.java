public class Employee {

    String name;
    float basicsalary, grosssalary;

    Employee(String name, float basicsalary){
        this.name = name;
        this.basicsalary = basicsalary;
    }

    public float getGrosssalary() {
        float DA,HRA;
        DA = 40 * basicsalary /100;
        HRA = 20 * basicsalary /100;
        grosssalary = basicsalary + DA + HRA;
        return grosssalary;
    }
}
