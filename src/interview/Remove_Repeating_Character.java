package interview;

import java.util.*;

public class Remove_Repeating_Character {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries(8)));
        System.out.println(Arrays.toString(uniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));

    }

    public static String remove(String str) {
        TreeSet<Character> set = new TreeSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static int[] fibonacciSeries(int n) {
        int n1 = 0, n2 = 1, n3;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] += n1;
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return array;
    }

    public static int[] uniques(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            for (int i1 : b) {
                if (i == i1) {
                    list.add(i);
                }
            }
        }
        Set<Integer> list1 = new HashSet<>();
        for (int i : a) if (!list.contains(i)) list1.add(i);
        for (Integer integer : b) if (!list.contains(integer)) list1.add(integer);
        return list1.stream().mapToInt(i -> i).toArray();

    }
}