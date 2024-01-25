package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Write a word:");
        String word= input.next();

        word=word.replaceFirst("x","a");
        input.close();
        System.out.println(word);
        }

    }

/*
1. Create a class named StartsWithX and write a program that asks the user to enter a word.
If the word starts with 'x,' replace it with 'a'.

        Example:
              Input:
                 xcodex

              Output:
                 acodex

 */
