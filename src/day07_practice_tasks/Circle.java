package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();
        double calculateAreaOfCircle= radius*radius*3.14;
            System.out.println("The area of the Circle is: "+ calculateAreaOfCircle);

       double calculatePerimeterOfCircle= radius*2*3.14;
            System.out.println("The perimeter of the Circle is: " + calculatePerimeterOfCircle);
            input.close();

    }
}
