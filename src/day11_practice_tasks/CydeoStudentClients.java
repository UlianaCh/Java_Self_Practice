package day11_practice_tasks;

public class CydeoStudentClients {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Dan", 23,123,'A',"US033",11);
        student1.schoolName= "Cydeo";
        student1.programmingLanguage = "Java";
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();
        System.out.println(student1);
        CydeoStudent student2 = new CydeoStudent("Anna", 33,20,'B',"US033",21);
        student2.schoolName= "Cydeo";
        student2.programmingLanguage = "JavaScript";
        student2.study();
        student2.attendClass();
        student2.printSchoolName();
        student2.printProgLanguage();
        System.out.println(student2);

    }
}
