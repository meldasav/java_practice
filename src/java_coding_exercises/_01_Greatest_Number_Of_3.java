package java_coding_exercises;

import java.util.Arrays;
import java.util.TreeSet;

public class _01_Greatest_Number_Of_3 {
    public static void main(String[] args) {
        System.out.println(greatestNumber3(1, 2, 3));
    }

    public static int greatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int greatestNumber1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        return c;
    }

    public static int greatestNumber2(int a, int b, int c) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        return numbers.last();
    }

    public static int greatestNumber3(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
