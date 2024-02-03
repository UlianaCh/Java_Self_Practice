package day09_practice_taks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] names = {"John Doe","Alice Smith", "Robert Johnson","Daniel Arron", "Jimmy Joe", "Mike Jonathan", "Breanna King", "John Smith", "Anne White", "Walter Ray"};
        String[] initials = findIniials(names);
        System.out.println(Arrays.toString(initials));
        for (int i = 0; i < names.length; i++) {
            System.out.println(initials[i]);
        }

    }
    public static String[] findIniials(String[] names){
        String[] initials = new String[names.length];
        for (int i = 0; i < names.length ; i++) {

            initials[i]=names[i].charAt(0)+""+names[i].charAt(names[i].indexOf(" ")+1);
        }
        return initials;
    }
}
/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.
 */