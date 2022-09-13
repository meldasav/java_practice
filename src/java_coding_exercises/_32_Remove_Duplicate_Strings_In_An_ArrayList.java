package java_coding_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _32_Remove_Duplicate_Strings_In_An_ArrayList {
    public static void main(String[] args) {
        System.out.println(removeDuplicates1(new ArrayList<>(Arrays.asList("foo", "boo", "foo", "booo"))));

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static ArrayList<String> removeDuplicates1(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (list1.contains(s)) {
                continue;
            }
            list1.add(s);
        }
        return list1;
    }
}
