package java_coding_exercises;

public class _23_Count_Numbers_Greater_Than_10_In_An_Array {
    public static void main(String[] args) {
        System.out.println(greaterThen10(new int[]{10, 30, 45, 7, 9}));
    }

    public static int greaterThen10(int[] array) {
        int count = 0;
        for (int i : array) if (i > 10) count++;
        return count;
    }
}

