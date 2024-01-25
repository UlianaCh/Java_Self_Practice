package day04_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 42;

        if (age >= 0 && age <= 20) {
            System.out.println("Teenager");
        }else if ( age >=35 && age <=45) {
            System.out.println("Young Middle-Aged Adult");
        }else if (age >= 21 && age <= 54 ) {
            System.out.println("Adult");
        }
        else if (age >= 55 && age <= 150) {
            System.out.println("Senior");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
