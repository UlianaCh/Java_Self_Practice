package day13_practice_tasks.student;

public class StudentClients {
    public static void main(String[] args) {
        Student student = new Student("Dan", "M", 25);
        System.out.println(student);
        Students students = new Students("Ann", "F", 23, "123", "math", "College", 'A');
        System.out.println(students);
        students.study();
        GraduateStudents graduateStudents = new GraduateStudents("Max", "M", 22, "124", "science", "University", 'B');
        System.out.println(graduateStudents);
        graduateStudents.study();
        UndergraduateStudents undergraduateStudents = new UndergraduateStudents("Ben", "M", 18, "125", "history", "historyschool", 'A');
        System.out.println(undergraduateStudents);
        undergraduateStudents.study();
        CydeoStudents cydeoStudents = new CydeoStudents("Uliana", "F", 37, "125", "SDET", "Cydeo", 'A', 33, 12, "Java");
        System.out.println(cydeoStudents);
        cydeoStudents.study();


    }
}
