package Arrays;

import java.util.Arrays;

public class Compare2Array {
    public static void main(String[] args) {
        int[] array1 = {5, 8, 13, 1, 2};
        int[] array2 = {9, 3, 68, 1, 5};
        int[] array3 = new int[5];
        System.out.println(Arrays.toString(findMax(array1, array2)));

        for (int i = 0; i < array1.length; i++) {
            array3[i] += Math.max(array1[i], array2[i]);
        }
        System.out.println(Arrays.toString(array3));
    }

    public static int[] findMax(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] += Math.max(array1[i], array2[i]);
        }
        return array3;
    }
}
