package day07_practice_tasks;
import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter the price:");
        double price = scanner.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter their first name:");
        String name = scanner.next();
        System.out.println(name + ", your order for " + quantity + " " + productName + " has been placed. Your total is " + quantity * price);
        scanner.close();
    }
}

