package java_coding_exercises;

public class _17_Sum_Of_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3}));

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum;
    }

}

