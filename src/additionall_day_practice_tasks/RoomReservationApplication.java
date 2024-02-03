package additionall_day_practice_tasks;

import java.util.Scanner;

public class RoomReservationApplication {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Welcome to the Cydeo Skyline Inn!\nWould you like to reserve a room? (Yes/No)");
        String answer = scan.next().toLowerCase();
        while (!(answer.equals("yes") || answer.equals("no"))) {  //  !(valid) ===> invalid
            System.err.println("Invalid entry, Please re-enter! Would you like to reserve a room? (Yes/No)");
            answer = scan.nextLine().toLowerCase();
        } // Making sure that user will enter either yes or no

        if (answer.equals("no")) { // if the user does not want to reserve
            System.err.println("You have a wonderful day!");
            return; // exits the main method
        }
            System.out.println("Enter your first name:");
            String firstname = scan.next();
            System.out.println("Enter your last name:");
            String lastname = scan.next();
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            System.out.println("Select from available rooms: \nSingle Bed ==> $100\nQueen Bed  ==> $120\nKing Bed   ==> $160");
            String bed=scan.next();
            System.out.println("How many nights would you like to stay?");
            int nights = scan.nextInt();
            System.out.println("Are you a veteran?(Y/N)");
            String veteran= scan.next();
        double startingPrice = (bed.equalsIgnoreCase("single")) ? 100
                :(bed.equalsIgnoreCase("queen")) ? 120 : 160;

        double tax = startingPrice*0.08;
        double grandtotal = startingPrice*nights+tax;
        double discount;
        if(age>=64){discount=grandtotal*0.1;
            grandtotal = grandtotal-discount;
        }else if(veteran.equals("yes"))
        {discount=grandtotal*0.15;
            grandtotal = grandtotal-discount;
        }
        System.out.println("Hello "+firstname+", You have selected "+bed+" for "+nights+"nights to stay.\n" +
                "Room fee: $"+startingPrice+"\nTax is: $"+tax+"\n" +
                "Your grand total is: $"+(grandtotal));
        scan.close();


}

}


/*
3. Create a class named RoomReservationApplication and write a program with the following requirements:

	1. Display the following welcome message on the console:
			"Welcome to the Cydeo Skyline Inn!"

	2. Ask the user, "Would you like to reserve a room? (Yes/No)"

	3. If the user enters "No," then display the following message:
			"You have a wonderful day!"

	4. the user enters "Yes," then gather the following information:
		4.1 Ask the user's first name
		4.2 Ask the user's last name
		4.3 Ask the user's age
		4.4 Display the available room types and ask which type of room the user would like to reserve
		4.5 Ask how many nights the user wants to stay
		4.6 Ask if the user is a veteran

	5. For any other inputs, the application should ask the user to re-enter until the user provides a valid entry.

	6. Calculate the total price based on the selected room type and the number of nights the user is staying.
	Room types and their prices:
						Single Bed ==> $100
						Queen Bed  ==> $120
						King Bed   ==> $160

	7. Calculate the tax and grand total, assuming the sales tax is 8%.

	8. Calculate the total discount the user is eligible for:
		If the user is a senior (at least 64 years old), they are eligible for a senior discount (10%).
		If the user is a veteran, they are eligible for a veterans discount (15%).

	9. Display the user's first name, total cost, tax, total discounts, and grand total in the following format on the console:

				Example 1:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: No

					Output:
						You have a wonderful day!


				Example 2:
								Welcome to the Cydeo Skyline Inn!

					Agent: Would you like to reserve a room? (Yes/No)
					User: Yes

					Agent: Please enter your first name:
					User: Jimmy

					Agent: Please enter your last name:
					User: Joe

					Agent: Please enter your age:
					User: 55

					Agent: Here are our available rooms and their prices:
									 King Bed   ===== $160
									 Queen Bed  ===== $120
									 Single Bed ===== $100

							Which room would you like to reserve? (King/Queen/Single)
					User: King

					Agent: How many nights would you like to stay?
					User: 3

					Agent: Are you a veteran? (Yes/No)
					User: No

					Output:
						Hello Jimmy, You have selected King Bed for 3 nights to stay.
						Room fee: $480.00
						Tax is: $38.40

						Your grand total is: $518.40

 */