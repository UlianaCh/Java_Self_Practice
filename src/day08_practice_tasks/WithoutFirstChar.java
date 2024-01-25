package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1 = input.next();
        System.out.println("Enter word2:");
        String word2 = input.next();
        System.out.println(word1.substring(1)+word2.substring(1));
        input.close();
    }
}
/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana
 */