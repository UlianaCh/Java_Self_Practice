package day17_practice_tasks;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {
        // step 1 create map 1 and map 2 and print
        Map<Character,Integer> map1= new HashMap<>();
        Map<Character,Integer> map2= new HashMap<>();
        map1.put('A',10);
        map1.put('B',20);
        map2.put('B',30);
        map2.put('C',40);
        System.out.println(map1);
        System.out.println(map2);
        // step 3 create output  and add map1
        Map<Character,Integer> output= new HashMap<>();
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            output.put(entry.getKey(),entry.getValue());
        }
        // step 4 add map2 also check  and if condition and print
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            char key= entry.getKey();
            int value= entry.getValue();
            if (output.containsKey(key)){
                output.put(key,output.get(key)+value);
            } else {
                output.put(key,value);
            }
        }
        System.out.println(output);

    }
}
/*
3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}
 */