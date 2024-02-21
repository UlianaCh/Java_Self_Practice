package day16_practice_tasks;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        Set<Integer> list1 = new LinkedHashSet<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        Set<Integer> list2 = new LinkedHashSet<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        Set<Integer> mergeList = new LinkedHashSet<>(list1);
        mergeList.addAll(list2);

        System.out.println(mergeList);


    }
}
/*
2. Create a class named MergeLists and write a program that merges two given lists of integers into a third list. Ensure that the third list contains no duplicate elements and maintains the original order of elements from the input lists.

         Example:
            list1 = {10, 20, 30, 40, 50, 60, 70}
            list2 = {30, 40, 50, 60, 70, 80, 90, 100}

         Output:
            list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

 */