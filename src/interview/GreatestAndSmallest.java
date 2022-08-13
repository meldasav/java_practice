package interview;

import java.util.TreeSet;

public class GreatestAndSmallest {
    public static void main(String[] args) {
        findGreatestAndSmallest1(new int[]{10, 7, 7, 10, -3, 10, -3});
    }


    public static void findGreatestAndSmallest(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        System.out.println("Greatest number = " + set.last());
        System.out.println("Smallest number = " + set.first());
    }

    public static void findGreatestAndSmallest1(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        for (int i : array) {
            if (i < min) min = i;
        }
        System.out.println("Greatest Number is " + max);
        System.out.println("Smallest Number is " + min);
    }

}

