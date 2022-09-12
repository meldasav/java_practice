package java_coding_exercises;

import java.util.Arrays;
import java.util.TreeSet;

public class _02_Smallest_Number_Of_3 {
    public static void main(String[] args) {
        System.out.println(smallestNumber3(1, 2, 3));

    }

    public static int smallestNumber(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int smallestNumber1(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        return array[0];
    }

    public static int smallestNumber2(int a, int b, int c) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        return set.first();
    }

    public static int smallestNumber3(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        return c;
    }

}
