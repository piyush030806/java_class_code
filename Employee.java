class Employee{
    int salary = 60000;
}

class Engineer extends Employee {
    int benefits = 10000;
}

public class Main {
    public static void main(String[] args) {

        Engineer e = new Engineer();

        int total = e.salary + e.benefits;

        System.out.println("Salary: " + e.salary);
        System.out.println("Benefits: " + e.benefits);
        System.out.println("Total: " + total);
    }
}