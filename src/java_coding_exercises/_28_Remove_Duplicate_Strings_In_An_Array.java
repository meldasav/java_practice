package java_coding_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _28_Remove_Duplicate_Strings_In_An_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates1(new String[]{"Foo", "Buzz", "Foo", "Buzz"})));
    }

    public static String[] removeDuplicates(String[] array) {
        HashSet<String> set = new HashSet<>(Arrays.asList(array));
        return set.toArray(new String[0]);
    }

    public static String[] removeDuplicates1(String[] array) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (list1.contains(s)) {
                continue;
            }
            list1.add(s);
        }
        return list1.toArray(new String[0]);
    }

}


