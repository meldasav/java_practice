package java_coding_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _31_Remove_Duplicate_Numbers_In_An_ArrayList {
    public static void main(String[] args) {
        System.out.println(removeDuplicates1(new ArrayList<>(Arrays.asList(0, 1, 2, 3, 3, 2, 0))));
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            if (list1.contains(integer)) {
                continue;
            }
            list1.add(integer);
        }
        return list1;
    }
}
