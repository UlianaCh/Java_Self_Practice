package day04_practice_tasks;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int median = (a+b+c) / 3;
        if (a==b){
            System.out.println("Invalid");
        } else if (a==c){
            System.out.println("Invalid");
        } else if (b==c){
            System.out.println("Invalid");
        } else {
            System.out.println(median +" is the median number");
        }
    }
}
