package java_coding_exercises;

public class _25_Count_Even_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(countEven(new int[]{2, 4, 6, 7, 9}));
    }

    public static int countEven(int[] array) {
        int count = 0;
        for (int i : array) if (i % 2 == 0) count++;
        return count;
    }
}

