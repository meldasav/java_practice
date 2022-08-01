package generics;

import java.util.ArrayList;
import java.util.List;

public class Practice11 {

    static List<Integer> sort(List<Integer> list) {// 8, 5, 7, 6
        List<Integer> newList = new ArrayList<>();

        while (!list.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (Integer integer : list) {
                if (integer < min) {
                    min = integer;
                }
            }
            newList.add(min);
            int finalMin = min;
            list.removeIf(n -> n == finalMin); // lambda
        }
        return newList;
    }

     public static void main(String[] args) {


    }
}
