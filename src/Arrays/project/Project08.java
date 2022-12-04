package Arrays.project;

import java.util.Arrays;

public class Project08 {
    public static void main(String[] args) {
        
        System.out.println(findClosestDistance(new int[]{4}));
        System.out.println(findClosestDistance(new int[]{4, 4}));
        System.out.println(findClosestDistance(new int[]{4, 8, 10, 15}));
        System.out.println(findClosestDistance(new int[]{-5, 10, 20, 50, 100}));
    }

    public static int findClosestDistance(int[] array) {
        Arrays.sort(array);
        int closestDistance = Integer.MAX_VALUE;
        if (array.length < 2) return -1;
        else {
            for (int i = 0; i + 1 < array.length; i++) {
                int dist = array[i + 1] - array[i];
                closestDistance = Math.min(dist, closestDistance);
            }
            return closestDistance;
        }
    }
}
