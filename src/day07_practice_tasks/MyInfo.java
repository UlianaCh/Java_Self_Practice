package day07_practice_tasks;
import java.util.Scanner;
public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Enter your gender");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your phone number");
        long phoneNum = input.nextLong();
        System.out.println("Enter your zip code");
        int zipCode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your School name");
        String schoolName = input.nextLine();
        System.out.println("Enter your city name");
        String city = input.nextLine();
        System.out.println("Enter your state name");
        String state = input.next();
        System.out.println("Enter your building number");
        int buildingNum = input.nextInt();
        System.out.println("Enter your Street name");
        input.nextLine();
        String street = input.nextLine();
        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNum);
        System.out.println("Address:\n\t" + buildingNum + " " + street + "\n\t" + city + ", " + state + " " + zipCode);

        input.close();
    }
}
