package day09_practice_taks;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] result = reverseArray(numbers);

       // System.out.println(Arrays.toString(result));
        System.out.println("reversed array= "+Arrays.toString(result));
    }

    public static int[] reverseArray (int[] array){

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
           reverseArray[j] = array[i];
        }
        return reverseArray;
    }
}
/*
8. Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

        Example:
array = {1,2,3,4,5};

Output:
reversedArray = {5,4,3,2,1};
        */