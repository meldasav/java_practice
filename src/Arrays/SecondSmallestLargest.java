package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SecondSmallestLargest {
    public static void main(String[] args) {
        secondMinSecondMax1(new int[]{1, 1, 2, 4, 5, 77, 90});
    }

    public static void secondMinSecondMax(int[] numbers) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        for (int number : numbers) {
            if (number != min && number < secondMin) secondMin = number;
            if (number != max && number > secondMax) secondMax = number;
        }
        System.out.println("Second max number is : " + secondMax);
        System.out.println("Second min number is : " + secondMin);
    }

    public static void secondMinSecondMax1(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int integer : numbers) set.add(integer);
        ArrayList<Integer> list = new ArrayList<>((set));
        System.out.println("Second min number is : " + list.get(1));
        System.out.println("Second max number is : " + list.get(list.size() - 2));
    }
}

