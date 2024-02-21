package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        // step 1 create list
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam" ));
        // step5  call removeDup
        removePalindrome(list);
    }

    public static void removePalindrome(List<String> list) {
        // step 2 create unpalindrome
        List<String> unPalindrome = new ArrayList<>();
        for (String each : list) {//  step 3 check each of
          //  boolean palindrome= true;
            for (int i = 0, j = each.length() - 1; i < j; i++, j--) {
                if (each.charAt(i) != each.charAt(j)) {
                //    palindrome = false;
                    //break;
                    if (!unPalindrome.contains(each)){
                        unPalindrome.add(each);
                   }
                }
            }
//            if (!palindrome){
//                if (!unPalindrome.contains(each)){
//                    unPalindrome.add(each);
//                }
//            }

        }
        list.clear(); // step 4 clear and add
        list.addAll(unPalindrome);
        System.out.println(unPalindrome);
    }
}
/*
6. Create a class named RemovePalindromes and write a program that removes all palindrome strings from a given list of strings. The removal should be performed without using the removeIf method.

         Example:
            list = {"Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                     "reviver", "racecar", "madam"}

         Output:
            {"Java", "Python", "Cydeo", "Car"}
 */