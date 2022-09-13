package java_coding_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _27_Remove_Duplicate_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicate1(new int[]{1, 1, 2, 2, 3, 4, 5})));
    }

    public static int[] removeDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        for (int integer : array) set.add(integer);
        //todo Lambda expression convert set to Array
        return set.stream().mapToInt(x -> x).toArray();
    }

    public static int[] removeDuplicate1(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) list.add(i);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            if (list1.contains(integer)) {
                continue;
            }
            list1.add(integer);
        }
        return list1.stream().mapToInt(x -> x).toArray();
    }
}

