package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseStringArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray1(new String[]{"A","B","C"})));
    }
    public static String[] reverseArray(String[] array){

        ArrayList<String> list=new ArrayList<>();
        for (int i = array.length-1; i >=0 ; i--) {
            list.add(array[i]);
        }
        return list.toArray(new String[0]);
    }

    // Second way (collections have a reverse method)
    public static String[] reverseArray1(String[] array){
        Collections.reverse(Arrays.asList(array));
        return array;
    }

}
