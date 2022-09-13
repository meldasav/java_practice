package java_coding_exercises;

import java.util.Arrays;
import java.util.TreeSet;

public class _48_Min_Value_In_An_Int_Array {
    public static void main(String[] args) {
        System.out.println(min2(new int[]{1, 2, 3}));

    }

    public static int min(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int min1(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        return set.first();
    }

    public static int min2(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        return min;
    }
}
