package interview.array_practice;

import java.util.Arrays;

public class Shift_All_Zero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shiftZeros(new int[]{1,0,2,0,3,0})));
    }

    public static int[] shiftZeros(int[] array) {
        int[] arr = new int[array.length];
        int count = 0;
        for (int i : array) {
            if (i != 0) {
                arr[count] += i;
                count++;
            }
        }
        return arr;
    }


    }


