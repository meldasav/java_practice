package interview;

import java.util.Arrays;

public class Find_ClosestTo_10 {
    public static void main(String[] args) {
        System.out.println(findClosestTo10(new int[]{10, -13, 5, 70, 15, 57}));
    }

    public static int findClosestTo10(int[] arr) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10 && Math.abs(10 - arr[i]) < Math.abs(10 - closest)) {
                closest = arr[i];
            }
        }
        return closest;
    }
}
