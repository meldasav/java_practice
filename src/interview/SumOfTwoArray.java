package interview;

import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwoArray(new int[]{3, 0, 0, 7, 5, 10}, new int[]{6, 3, 2})));
    }
    public static int[] sumOfTwoArray(int[] array1, int[] array2) {
        for (int i = 0; i < Math.min(array1.length, array2.length); i++) {
            if (array1.length > array2.length) array1[i] += array2[i];
            else array2[i] += array1[i];
        }
        return array1.length > array2.length ? array1 : array2;
    }
}
