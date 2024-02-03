package day09_practice_taks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        int[] array={10,0,5,0,1,0};
        Arrays.sort(array);
        for (int i=array.length-1; i>=0  ; i--) {
            System.out.print(array[i]+" ");

        }
    }
}
/*
9. Create a class named MoveTheZeros and write a program that can move all the zeros to the end of the array.

			Example:
				array = {10, 0, 5, 0, 1, 0};

			Output:
				{10, 5, 1, 0, 0, 0};

 */