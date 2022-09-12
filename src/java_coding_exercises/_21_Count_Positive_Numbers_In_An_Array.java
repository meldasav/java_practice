package java_coding_exercises;

public class _21_Count_Positive_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(countPositive(new int[]{1,3,5,-2-5}));
    }
    public static int countPositive(int[] array){
        int count=0;
        for (int i : array) if(i>0)count++;
        return count;
    }
}
