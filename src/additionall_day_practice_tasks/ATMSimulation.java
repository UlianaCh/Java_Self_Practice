package additionall_day_practice_tasks;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        int accountBalance = 100000;
        System.out.println("Please enter your pin:");
        int scan = input.nextInt();

        if (!(scan == pin)){
           System.err.println("Incorrect Pin Number, Please re-enter:");
                scan = input.nextInt();
            }
        if (!(scan == pin)){  System.err.println("Incorrect Pin Number, Please re-enter:");
                scan = input.nextInt();}


        if (!(scan == pin)){

                System.err.println("Your card is locked. Please contact with your local bank");}

        if (scan == pin){
            System.out.println("Select from these options:\n\t1.Check Balance\n\t2.Deposit Money\n\t3.Withdraw Money");
            int option = input.nextInt();
            int choice1 = 1;
            int choice2 = 2;
            int choice3 = 3;

                     if (option==choice1){
                         System.out.println(accountBalance);
                          }
            else if(option==choice2){
                        System.out.println("Enter amount to deposit:");
                        int amounttoDeposit = input.nextInt();
                        if (amounttoDeposit > 0) {
                            int totalBalance = accountBalance + amounttoDeposit;
                            System.out.println(totalBalance);
                        } else {
                            System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                        }}
                          else if(option==choice3)
                          {
                        System.out.println("Enter amount to withdraw:");
                        int amounttoWithdraw = input.nextInt();
                        if (amounttoWithdraw > 0 && amounttoWithdraw <= accountBalance) {
                            int totalBalance1 = accountBalance - amounttoWithdraw;
                            System.out.println(totalBalance1);
                        } else if (amounttoWithdraw > accountBalance) {
                            System.out.println("Insufficient funds. Withdrawal failed.");
                        } else {
                            System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                        }

                    }else{
                             System.out.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
                             return;
                     }
                          input.close();

                }

            }}
/*
1. Create a class named ATMSimulation. Write a program with the following requirements:

   1. Given the following variables:
      - pinNumber: contains the correct pin number of the card
      - accountBalance: current account balance of the card

   2. Ask the user to enter their pin number.
      If the user-entered pin number does not match the correct pin number, give 2 more attempts for user to re-enter.
      		"Incorrect Pin Number, Please re-enter:"

      If all the attempts are failed, then the program should be terminated with the following error message:
      	"Your card is locked. Please contact with your local bank"

   3. If user entered the valid pin number, Ask the user to select from one of the three following options:
      	3.1 Check Balance:
          Displays the available balance.

      	3.2 Deposit Money:
          Asks the user to enter the amount to deposit and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Depositing amount cannot be zero or negative, please try again later."

      	3.3 Withdraw Money:
          Asks the user to enter the amount to withdraw and displays the new available balance.

          If the user enters an invalid amount (0 or negative), then the program should
          be terminated with the following error message:
          	"Cannot withdraw zero or negative amount, please try again later."

          If the user-entered amount is greater than the available balance, then the program
          should be terminated with the following error message:
          	"Insufficient funds. Withdrawal failed."

	   	3.4 If the user does not select one of the three options above, then the following
   			error message should be displayed on the console:
	      		"Invalid choice. Exiting the ATM. Thank you for using our services!"
 */









