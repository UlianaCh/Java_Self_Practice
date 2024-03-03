package day16_practice_tasks;

import java.util.*;

public class DifferenceBetweenTwoSets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

        set1.removeAll(set2);
        System.out.println(set1);

//        Set<Integer> set1= new TreeSet<>(Arrays.asList(1, 2, 3,5));
//        Set<Integer>set2= new TreeSet<>(Arrays.asList(2, 3, 4));
//
//        Set <Integer> set3= new HashSet<>();
//        set3.addAll(set1);
//        set3.addAll(set2);
//        // remove set 2
//        set3.removeAll(set2);
//        System.out.println(set3);
    }

}
/*
4. Create a class named DifferenceBetweenTwoSets and write a program that calculates the difference between two sets of integers (elements in the first set but not in the second) and displays the result.

         Example:
            Set1 = {1, 2, 3, 5}
            Set2 = {2, 3, 4}

         Output:
            {1, 5}
 */