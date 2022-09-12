package java_coding_exercises;

public class _22_Count_Negative_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(countNegative(new int[]{1, -2, 4, -8, 0}));
    }

    public static int countNegative(int[] array) {
        int count = 0;
        for (int i : array) if (i < 0) count++;
        return count;
    }
}

