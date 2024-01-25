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
            System.out.println("Select from these options:\n\tCheck Balance\n\tDeposit Money\n\tWithdraw Money");
            String option = input.next();

            String choice1 = "Check Balance";
            String choice2 = "Deposit Money";
            String choice3 = "Withdraw Money";
           // while (!(option.equalsIgnoreCase(choice1))|| option.equalsIgnoreCase(choice2)||option.equalsIgnoreCase(choice3)){
               // System.out.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
             //   return;
          //  }
            if (option.equalsIgnoreCase(choice1)){
                        System.out.println(accountBalance);
            }else if(option.equalsIgnoreCase(choice2)){
                        System.out.println("Enter amount to deposit:");
                        int amounttoDeposit = input.nextInt();
                        if (amounttoDeposit > 0) {
                            int totalBalance = accountBalance + amounttoDeposit;
                            System.out.println(totalBalance);
                        } else {
                            System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                        }
                    }
            else if(option.equalsIgnoreCase(choice3)){
                        System.out.println("Enter amount to withdraw:");
                        int amounttoWithdraw = input.nextInt();
                        if (amounttoWithdraw > 0 && amounttoWithdraw <= accountBalance) {
                            int totalBalance = accountBalance - amounttoWithdraw;
                            System.out.println(totalBalance);
                        } else if (amounttoWithdraw > accountBalance) {
                            System.out.println("Insufficient funds. Withdrawal failed.");
                        } else {
                            System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                        }
                    }

                }
            }}










