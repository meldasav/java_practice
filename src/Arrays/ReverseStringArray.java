package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new String[]{"A","B","C"})));
    }
    public static String[] reverseArray(String[] array){

        ArrayList<String> list=new ArrayList<>();
        for (int i = array.length-1; i >=0 ; i--) {
            list.add(array[i]);
        }
        return list.toArray(new String[0]);
    }
}
