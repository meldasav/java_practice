package java_coding_exercises;

import java.util.TreeSet;

public class _49_Second_Max_Value_In_An_Int_Array {
    public static void main(String[] args) {
        System.out.println(secondMax1(new int[]{1, 2, 3, 4}));
    }

    public static int secondMax(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        int[] array1 = set.stream().mapToInt(x -> x).toArray();
        return array1[array1.length - 2];
    }

    public static int secondMax1(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        for (int i : array) {
            if (i > secondMax && i != max) secondMax = i;
        }
        return secondMax;
    }
}
