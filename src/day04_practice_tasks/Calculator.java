package day04_practice_tasks;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 20;

        char mathOperator = '+';

        switch (mathOperator) {

            case '+':
                System.out.println((n1 + n2));
                break;

            case '-':
                System.out.println((n1 - n2));
                break;

            case '*':
                System.out.println((n1 * n2));
                break;

            case '/':
                System.out.println((n1 / n2));
                break;

            default:
                System.out.println("Invalid Operator");

        }
    }
}
