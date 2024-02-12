package day13_practice_tasks.person;

import day13_practice_tasks.person.Employee;

public class Teacher extends Employee {
    public Teacher(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
