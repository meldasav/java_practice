package interview;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondGreatestAndSecondSmallest {
    public static void main(String[] args) {
        findSecondGreatestAndSecondSmallest(new int[]{10, 5, 6, 7, 8, 5, 15, 15});
    }

    public static void findSecondGreatestAndSecondSmallest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : array) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        for (int i : array) {
            if (i > secondMax && i != max) secondMax = i;
            if (i < secondMin && i != min) secondMin = i;
        }
        System.out.println("Second Greatest Number is = " + secondMax);
        System.out.println("Second Smallest Number is = " + secondMin);
    }

    public static void findSecondGreatestAndSecondSmallest1(int[] array) {
        int secondMin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        ArrayList<Integer> list = new ArrayList<>(set);

        for (Integer integer : list) if (integer < min) min = integer;
        for (Integer integer : list) if (integer != min && integer < secondMin) secondMin = integer;

        System.out.println("Second Greatest Number is = " + list.get(list.size() - 2));
        System.out.println("Second Smallest Number is = " + secondMin);
    }


}
