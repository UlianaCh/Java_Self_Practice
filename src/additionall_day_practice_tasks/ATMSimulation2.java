package additionall_day_practice_tasks;
import java.util.Scanner;
public class ATMSimulation2 {
    public static void main(String[] args) {

        int pinNumber;
        double accountBalance = 1234.23;
        int attempts;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pin number!");
        pinNumber = input.nextInt();


        for (attempts = 1; attempts < 3; attempts++) {
            if (pinNumber == 1234) {
                break;
            } else {
                System.out.println("Incorrect Pin Number, Please re-enter:");
                pinNumber = input.nextInt();
            }

        }
        if (pinNumber != 1234 && attempts == 3) {
            System.err.println("Your card is locked. Please contact with your local bank");
            return;
        }
        System.out.println("Select from one of the three following options: \n\tCheck Balance" +
                "\t\tDeposit Money\t\tWithdraw Money");
        input.nextLine();
        String options = input.nextLine();

        boolean validOptions = options.equalsIgnoreCase("Check Balance") || options.equalsIgnoreCase("Deposit Money")
                || options.equalsIgnoreCase("Withdraw Money");


        if (!validOptions) {
            System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
            return;
        }

        if (options.equalsIgnoreCase("Check Balance"))
            System.out.println("The available balance: $" + accountBalance);

//ATMSimulation (part 2/2 of the code)

        if (options.equalsIgnoreCase("Deposit Money")) {
            System.out.println("Enter the amount to deposit");
            double deposit = input.nextDouble();
            if (deposit <= 0) {
                System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                return;
            }
            System.out.println("The new available balance: $" + (accountBalance += deposit));
        }

        if (options.equalsIgnoreCase("Withdraw Money")) {
            System.out.println("Enter the amount to withdraw:");
            double withdraw = input.nextDouble();
            if (withdraw <= 0) {
                System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                return;
            }
            if (accountBalance < withdraw) {
                System.err.println("Insufficient funds. Withdrawal failed.");
                return;
            }

            System.out.println("The new available balance: $" + (accountBalance -= withdraw));

        }


        input.close();
    }
}

