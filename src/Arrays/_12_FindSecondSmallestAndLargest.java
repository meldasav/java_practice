package Arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class _12_FindSecondSmallestAndLargest {
    public static void findSecondLargestAndSmallest(int[] numbers) {
        if (numbers.length == 0) System.out.println("Array is empty");
        else {
            TreeSet<Integer> set = new TreeSet<>();
            for (int num : numbers) set.add(num);
            ArrayList<Integer> list = new ArrayList<>(set);
            System.out.println("Second smallest : " + list.get(1));
            System.out.println("Second largest : " + list.get(list.size() - 2));
        }
    }

    public static void findSecondLargestAndSmallest1(int[] numbers) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        for (int number : numbers) {
            if (number != min && number < secondMin) secondMin = number;
            if (number != max && number > secondMax) secondMax = number;
        }
        System.out.println("Second smallest : " + secondMin);
        System.out.println("Second largest : " + secondMax);
    }

    public static void main(String[] args) {
        findSecondLargestAndSmallest(new int[]{1, 1, 2, 3, 4, 5});
        findSecondLargestAndSmallest1(new int[]{1, 1, 2, 3, 4, 5});

    }
}
