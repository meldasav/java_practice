package interview;

import java.util.HashSet;
import java.util.TreeSet;

public class GreatestAndSmallest {
    public static void main(String[] args) {
        findGreatestAndSmallest(new int[]{10, 7, 7, 10, -3, 10, -3});
    }


    public static void findGreatestAndSmallest(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : array) set.add(i);
        System.out.println("Greatest number = " + set.last());
        System.out.println("Smallest number = " + set.first());
    }


}

