package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _23_ContainsApple {
    public static void main(String[] args) {
        System.out.println(containApple(new ArrayList<>(Arrays.asList("APPLE", "apple", "banana", "kiwi"))));
        System.out.println(containApple1(new ArrayList<>(Arrays.asList("APPLE", "apple", "banana", "kiwi"))));
        System.out.println(containApple(new ArrayList<>(Arrays.asList("APPle","aPPle"))));

    }
    public static boolean containApple(ArrayList<String> list) {
        return list.toString().toLowerCase().contains("apple");
    }
    public static boolean containApple1(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            if(fruit.equalsIgnoreCase("apple"))return true;
        }
        return false;
    }
    
}
