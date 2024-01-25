package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1 = input.next();
        System.out.println("Enter word2:");
        String word2 = input.next();
        String combinedWords = combineWords(word1, word2);
        System.out.println("Combined Words: " + combinedWords);

        input.close();
    }
    public static String combineWords(String word1, String word2) {

        if (word1.length() > 0 && word2.length() > 0 &&
                word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            return word1 + word2.substring(1);
        } else {
            return word1 + word2;
        }
    }
}
/*
3. Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight
 */
