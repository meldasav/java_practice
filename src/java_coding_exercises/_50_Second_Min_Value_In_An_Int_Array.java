package java_coding_exercises;

import java.util.TreeSet;

public class _50_Second_Min_Value_In_An_Int_Array {
    public static void main(String[] args) {
        System.out.println(secondMin(new int[]{1, 2, 3, 4}));
    }

    public static int secondMin(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        int[] array1 = set.stream().mapToInt(x -> x).toArray();
        return array1[1];
    }

    public static int secondMin1(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) min = i;
        }
        for (int i : array) {
            if (i < secondMin && i != min) secondMin = i;
        }
        return secondMin;
    }
}


