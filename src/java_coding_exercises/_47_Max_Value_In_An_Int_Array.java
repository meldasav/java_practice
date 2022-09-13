package java_coding_exercises;

import java.util.Arrays;
import java.util.TreeSet;

public class _47_Max_Value_In_An_Int_Array {
    public static void main(String[] args) {
        System.out.println(max2(new int[]{1, 2, 3}));

    }

    public static int max(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static int max1(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        return set.last();
    }

    public static int max2(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        return max;
    }

}
