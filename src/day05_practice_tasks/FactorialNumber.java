package day05_practice_tasks;

public class FactorialNumber {
    public static void main(String[] args) {
        int fac=1;
        int num =5;

        for (int i = 1; i <= num; i++) {
            fac *=i;
        }
        System.out.println(fac);
    }
}
