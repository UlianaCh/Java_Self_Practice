package day13_practice_tasks.person;

public class EmployeeClients {
    public static void main(String[] args) {


        Developer developer = new Developer("Sam", 22, "Male","1", "developer", 120_000, "Apple", "JavaScript");
        System.out.println(developer);
        developer.work();

        Teacher teacher = new Teacher("Bob", 56, "Male","1", "teacher", 120_000, "School");
        System.out.println(teacher);
        teacher.work();

        Tester tester = new Tester("Helen", 45, "Female","2", 120000,  "Google");
        System.out.println(tester);
        tester.work();
        Driver driver = new Driver("Dima", 60, "Male","10", "driver", 80_000, "DrivingSchool" );
        System.out.println(driver);
        driver.work();
    }
}
