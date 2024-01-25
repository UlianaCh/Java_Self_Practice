package day05_practice_tasks;

public class Alphabets {
    public static void main(String[] args) {
        for (char capital = 'A'; capital <= 'E'; capital++) {

            for (char lower = 'a'; lower <= 'z'; lower++) {

                System.out.print(capital);
                System.out.print(lower);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
