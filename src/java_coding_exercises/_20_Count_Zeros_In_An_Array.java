package java_coding_exercises;

public class _20_Count_Zeros_In_An_Array {
    public static void main(String[] args) {
        System.out.println(countZero(new int[]{1,0,2,0,0}));
    }
    public static int countZero(int[] array){
        int count=0;
        for (int i : array) {
            if(i==0)count++;
        }
        return count;
    }
}
