package java_coding_exercises;

import java.util.Arrays;

public class _03_Middle_Number_Of_3 {
    public static void main(String[] args) {
        System.out.println(middleNumber1(1, 2, 3));
    }

    public static int middleNumber(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        if (a != min && a != max) return a;
        else if (b != max && b != min) return b;
        return c;
    }

    public static int middleNumber1(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        return array[1];
    }

}
