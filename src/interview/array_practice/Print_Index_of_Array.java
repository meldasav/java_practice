package interview.array_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_Index_of_Array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int index=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
               index+=i;
            }

        }
        System.out.println(index);
    }
}
