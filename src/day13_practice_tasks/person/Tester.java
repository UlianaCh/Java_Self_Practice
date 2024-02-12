package day13_practice_tasks.person;

public class Tester extends Employee {
    public Tester(String name, int age, String gender, String employeeId, double salary, String companyName) {
        super(name, age, gender, employeeId, "SDET", salary, companyName);
    }

    @Override
    public void work() {
        System.out.println("Tester " + getName() + " is testing.");
    }

}
