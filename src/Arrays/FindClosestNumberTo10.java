package Arrays;

import java.util.Arrays;

public class FindClosestNumberTo10 {

    public static void main(String[] args) {
        System.out.println(closestTo10(new int[]{10, 11, 12, 14, 7, 5}));
    }

    public static int closestTo10(int[] array) {

        Arrays.sort(array);

        int numberBefore10 = 0;
        int numberAfter10 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) numberBefore10 = array[i];
            else break;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 10) numberAfter10 = array[i];
        }
        if (array[0] >= 10) return numberAfter10;
        else if (array[array.length - 1] <= 10) return numberBefore10;
        if (Math.abs(10 - numberBefore10) <= (Math.abs(numberAfter10 - 10))) return numberBefore10;
        else return numberAfter10;

    }
}
