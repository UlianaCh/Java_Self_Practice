package day08_practice_tasks;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        String fullName = Name(firstName, lastName);
        System.out.println("Full Name: " + fullName);

        input.close();
    }

    public static String Name(String firstName, String lastName) {

        String updateFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String updateLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        return updateFirstName + " " + updateLastName;

    }
}
/*

6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */
