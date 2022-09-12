package java_coding_exercises;

public class _18_Product_Of_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(product(new int[]{1,3,3}));
    }

    public static int product(int[] array) {
        int product = 1;
        for (int i : array) product *= i;
        return product;
    }
}

