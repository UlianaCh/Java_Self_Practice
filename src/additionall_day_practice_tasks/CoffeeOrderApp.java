package additionall_day_practice_tasks;

import java.util.Scanner;

public class CoffeeOrderApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double blackCoffeePrice= 2.0;
        double lattePrice = 4.5;
        double cappuccinoPrice= 5.0;
        double totalPrice=0;


        System.out.println("\tWelcome to the Coffee Order App!\n" + "Would you like to order coffee?");
        String answer = scan.next().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {  //  !(valid) ===> invalid
            System.err.println("Invalid entry, Please re-enter! (Yes/No)");
            answer = scan.next().toLowerCase();
        }
        if(answer.equals("no")){
            System.out.println("Thanks for using our service!");
            return;
        }
        while (answer.equals("yes")){
            System.out.println("Pick a coffee option(1, 2, 3): \n 1. Black coffee: $"+blackCoffeePrice+"\n2. Latte: $" + lattePrice+"\n3.Cappuchino: $"+ cappuccinoPrice);
            int choice = scan.nextInt();
            while (!(choice == 1 || choice == 2 || choice == 3)) {
                System.err.println("Invalid entry. Please re-enter! Pick a coffee: (1/2/3)");
                choice = scan.nextInt();
            }
        String result = "";
        switch (choice) {
            case 1:
                result = "Added Black Coffee to Your Order.";
                totalPrice += blackCoffeePrice;
                break;
            case 2:
                result = "Added Latte to Your Order.";
                totalPrice += lattePrice;
                break;
            case 3:
                result = "Added Cappuccino to Your Order.";
                totalPrice += cappuccinoPrice;
                break;

        }

        System.out.println(result);

        System.out.println("Would you like another order?");
        answer = scan.next().toLowerCase();

                while (!(answer.equals("yes") || answer.equals("no"))) {
                    System.err.println("Invalid entry. Please re-enter! Would you like to order another coffee? (Yes/No)");
                    answer = scan.next().toLowerCase();
                }

                if (answer.equals("no")) {

                    System.out.println("Your total is: $" + totalPrice);
                    return;


                }


        }scan.close();

        }}





/*
2. Create a class named CoffeeOrderApp with the following variables:

        - blackCoffeePrice: the price of black coffee
        - lattePrice: the price of a latte
        - cappuccinoPrice: the price of a cappuccino
        - totalPrice: the total cost of the user's order

    Create a straightforward coffee ordering application with these steps:

        Step 1. Ask the user if they want to order coffee.

            	Welcome to the Coffee Order App!

            Would you like to order coffee?


            If they say "yes", proceed to step #2. If they say "no", display "Thanks for using our service!"

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

        Step 2. Display the coffee options on the console:

            Coffee Options:
                1. Black Coffee - $blackCoffeePrice
                2. Latte - $lattePrice
                3. Cappuccino - $cappuccinoPrice

        Step 3. Ask the user to pick a coffee:

            3.1 If they choose 1, display "Added Black Coffee to Your Order."

            3.2 If they choose 2, display "Added Latte to Your Order."

            3.3 If they choose 3, display "Added Cappuccino to Your Order."

            3.4 If their choice is invalid, the application should ask the user to re-enter until the user provides a valid entry.


        Step 4. Ask if they want another order:

            If they say "yes," repeat from step #2.

            If they say "no," display the total cost of their order: "Your total is: $total."

            For any other response, the application should ask the user to re-enter until the user provides a valid entry.

 */