package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.age =26;
        employee1.gender = 'M';
        employee1.jobTitle = "Manager";
        employee1.salary = 100000;
        employee1.work();
        System.out.println(employee1);
        Employee employee2 = new Employee();
        employee2.name = "Mary";
        employee2.age =30;
        employee2.gender = 'F';
        employee2.jobTitle = "SDET";
        employee2.salary = 150000;
        employee2.work();
        System.out.println(employee2);



    }
}
