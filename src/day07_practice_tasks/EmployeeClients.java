package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "John";
        employee1.age = 25;
        employee1.gender = 'M';
        employee1.jobTitle = "Manager";
        employee1.salary = 90000.00;
        employee1.work();
        System.out.println(employee1);
        System.out.println("----------------------------");
        Employee employee2 = new Employee();
        employee2.name = "Anne";
        employee2.age = 28;
        employee2.gender = 'f';
        employee2.jobTitle = "Assistant";
        employee2.salary = 65000.50;
        employee2.work();
        System.out.println(employee2);
    }
}
