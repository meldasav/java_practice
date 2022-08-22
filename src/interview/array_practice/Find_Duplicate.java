package interview.array_practice;

import java.util.*;

public class Find_Duplicate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDuplicate(new int[]{1, 1, 1, 2, 3, 4, 5, 5})));
        System.out.println(Arrays.toString(findDuplicate1(new int[]{1, 1, 1, 2, 3, 4, 5, 5})));
    }

    public static int[] findDuplicate(int[] array) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) list.add(i);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && !list1.contains(list.get(i))) {
                    list1.add(list.get(i));
                }
            }
        }
        return list1.stream().mapToInt(x -> x).toArray();
    }

    //TODO SECOND WAY USING HASHSET
    public static int[] findDuplicate1(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for (int i : array) {
            if (!set.add(i)) {
                set1.add(i);
            }
        }
        return set1.stream().mapToInt(x -> x).toArray();

    }


}

