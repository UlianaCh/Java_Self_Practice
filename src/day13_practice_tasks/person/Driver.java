package day13_practice_tasks.person;

public class Driver extends Employee {
    public Driver(String name, int age, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, employeeId, jobTitle, salary, companyName);
    }
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
