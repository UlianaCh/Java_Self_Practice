package day09_practice_taks;

import java.util.Arrays;

public class MoveTheZeros2 {
    public static void main(String[] args) {

        int [] array = {10, 0, 5, 0, 1, 0};
        int [] arrayZerosEnd = new int[array.length];

        for (int i = 0, j= 0; i < array.length; i++) {
            if(array[i] != 0){
                arrayZerosEnd[j] = array[i];
                j ++;
            }
        }
        System.out.println(Arrays.toString(arrayZerosEnd));
    }
}
