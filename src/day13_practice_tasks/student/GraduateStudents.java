package day13_practice_tasks.student;

public class GraduateStudents extends Students {


    public GraduateStudents(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }


    public void study() {
        System.out.println(getName() + " studies as Grad");
    }

}
