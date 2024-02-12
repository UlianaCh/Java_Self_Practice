package day11_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 26, 'M', "Manager", 100000);
        employee1.work();
        System.out.println(employee1);
        Employee employee2 = new Employee("Mary", 30, 'F', "SDET", 150000);
        employee2.work();
        System.out.println(employee2);



    }
}
