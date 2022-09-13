package java_coding_exercises;

public class _26_Count_Odd_Numbers_In_An_Array {
    public static void main(String[] args) {
        System.out.println(countOdd(new int[]{1,3,5,7,8}));
    }
    public static int countOdd(int[] array){
        int count=0;
        for (int i : array) if(i%2==1)count++;
        return count;
    }
}
