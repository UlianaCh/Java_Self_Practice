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
/*1. Create a class named ArrayElements and write a program with the following specifications:
        1.1 Create an array of integers with a length of 100.
        1.2 Assign values from 1 to 100 to the indexes of the array.
        1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.

 */