package interview;

public class Max_Sum_Of_Array {

    public static void main(String[] args) {
        System.out.println(max(new int[]{1, 2, 3, 4, 5}, 2));
    }


    public static int maxSum(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        int maxSum = 0;
        int start = 0;
        for (int i = k; i < array.length; i++) {
            sum += array[i] - array[start++];
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }


    public static int max(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        int maxSum = 0;
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] - array[start++];
            if (sum > maxSum) maxSum = sum;
        }
        return sum;
    }


}


