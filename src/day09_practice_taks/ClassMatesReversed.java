package day09_practice_taks;

public class ClassMatesReversed {
    public static void main(String[] args) {

        // 6.1 Create an array of strings named classmates.
        // 6.2 Store full names of 10 classmates.
        String[] classmates = {"John Doe","Alice Smith", "Robert Johnson","Daniel Arron", "Jimmy Joe", "Mike Jonathan",
                "Breanna King", "John Smith", "Anne White", "Walter Ray"};

        String[] classmatesReversed = new String[classmates.length];

        // 6.3 Reverse each student's name and print them on separate lines.
        for (int i = 0; i < classmates.length; i++) {

            classmatesReversed[i] = classmates[i].substring(classmates[i].indexOf(" ")) + " " + classmates[i].substring(0, classmates[i].indexOf(" "));
            System.out.println(classmatesReversed[i]);

        }


    }
}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */
