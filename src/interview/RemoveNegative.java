package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveNegative {
    public static void main(String[] args) {
        System.out.println(removeNegativeNumber(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
        System.out.println(removeNegativeNumber1(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
    }

    public static ArrayList<Integer> removeNegativeNumber(ArrayList<Integer> list) {
        list.removeIf(x -> x < 0);
        return list;
    }

    public static ArrayList<Integer> removeNegativeNumber1(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number < 0) {
                iterator.remove();
            }
        }
        return list;
    }

}
