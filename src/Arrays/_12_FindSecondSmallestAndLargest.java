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
    public static void main(String[] args) {
        findSecondLargestAndSmallest(new int[]{1, 1, 2, 3, 4, 5});
    }
}
