package additionall_day_practice_tasks;
import java.util.Scanner;

public class CoffeeOrderApp2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double blackCoffeePrice = 1.2, lattePrice = 1.3, cappuccinoPrice = 1.4, totalPrice = 0;

        System.out.println("\t Welcome to the Coffee Order App!\n\tWould you like to order coffee? (Yes/No)");
        String answer = input.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry. Please re-enter! Would you like to order coffee? (Yes/No)");
            answer = input.next().toLowerCase();

        }
        if (answer.equals("no")) {
            System.out.println("Thanks for using our service!");
            return;
        }

        while (answer.equals("yes")) {
            System.out.println("\tCoffee Options:\n\t\t1. Black Coffee - $ " + blackCoffeePrice + "\n\t\t2. Latte - $" + lattePrice + "\n\t\t3. Cappuccino - $" + cappuccinoPrice + "\n");
            System.out.println("Pick a coffee: (1/2/3)");
            int choice = input.nextInt();


            while (!(choice == 1 || choice == 2 || choice == 3)) {
                System.err.println("Invalid entry. Please re-enter! Pick a coffee: (1/2/3)");
                choice = input.nextInt();
            }

// CoffeeOrderApp (part 2/2 of the code)

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
            System.out.println("Would you like to order another coffee? (Yes/No)");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry. Please re-enter! Would you like to order another coffee? (Yes/No)");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("no")) {

                System.out.println("Your total is: $" + totalPrice);
                return;


            }

        }

    }
}
