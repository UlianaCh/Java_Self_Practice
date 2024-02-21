package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccdeeeef";
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> uniqueCharacters = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> chEntry : map.entrySet()) {
            if (chEntry.getValue() == 1){
                uniqueCharacters.put(chEntry.getKey(),chEntry.getValue());
            }
        }
        System.out.println(uniqueCharacters);
    }
}
/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}


 */