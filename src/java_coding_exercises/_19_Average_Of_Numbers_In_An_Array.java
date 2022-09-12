package java_coding_exercises;

public class _19_Average_Of_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(average(new int[]{2, 3, 4}));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int i : array) sum += i;
        return sum / array.length;
    }
}

