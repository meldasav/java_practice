package interview;

import java.util.Arrays;

public class Left_Shift {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftShift(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3)));
    }

    public static int[] leftShift(int[] array, int leftShift) {
        int[] temp = new int[array.length];
        for (int i = array.length - 1; i > 0; i--) {
            int newPosition = (i + (array.length - leftShift)) % array.length;
            temp[newPosition] = array[i];
        }
        return temp;
    }
}
