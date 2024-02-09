package day13_practice_tasks.student;

import day13_practice_tasks.student.Students;

public class UndergraduateStudents extends Students {
    public UndergraduateStudents(String name, String gender, int age, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }
    public void study() {
        System.out.println(getName() + " studies as UnderGrad");
    }
}

