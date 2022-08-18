package interview;

import java.util.Arrays;

public class Shift_Right {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rightShift(new int[]{1,2,3,4,5,6,7,8},3)));
    }

    public static int[] rightShift(int[] array,int right_Shift){
        
        int[] temp=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newPosition=(i+right_Shift)% array.length;
            temp[newPosition]=array[i];
        }
        return temp;
    }
}
