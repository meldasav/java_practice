package interview;

public class Most_Counted_Element {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{3,2,5,4,1},2));
    }


    public static int maxSum(int[] num, int k) {
        if (num.length == 0 || k <= 0) return -1;
        int sum = 0;
        for (int i = k; i < num.length; i++) {
            sum += num[i];

        }
        int max_sum = sum;
        int start = 0;
        for (int i = 0; i < num.length; i++) {
            sum += sum - num[start++];

        }
        if (sum > max_sum) {
            max_sum = sum;
        }


        return max_sum;
    }

}

