package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
    Scanner str = new Scanner(System.in);

    System.out.println("Enter your E-Mail :");
    String emailAddress = str.next();

    eMailInfo(emailAddress);

    str.close();

}
    public static void eMailInfo(String emailAddress) {
        int underscore = emailAddress.indexOf('_');
        int atSymbol = emailAddress.indexOf('@');
        int dot = emailAddress.indexOf('.');

        if (underscore != -1 && atSymbol != -1&& dot!=-1) {
            String firstName = emailAddress.substring(0, underscore);
            String lastName = emailAddress.substring(underscore + 1, atSymbol);
            String domain = emailAddress.substring(atSymbol + 1, dot);


            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + domain);
        } else {
            System.out.println("Invalid");
        }
    }
}
/*
5. Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple
 */