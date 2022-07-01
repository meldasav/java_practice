import java.util.ArrayList;
import java.util.List;

public class _06Array_Practice {

    public static void main(String[] args) {
    }

    static Object array(int[] array, int number) {
        /*
    2 solutions - 5th of July
    Create a method which will return the max of any consecutive k numbers from an array
    arr = {4, 2, 5, 12, 20, 5, 23}, k = 3 ==> 48  //23
    arr = {100, 200, 600, 300}, k = 2     ==> 900
    arr = {1, 2, 3}, k = 4                ==> -1
     */

        if (number > array.length) {
            return -1;
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int j : array) {
            arrayList.add(j);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int max = Integer.MIN_VALUE;
            for (int integer : arrayList) {
                if (integer > max) max = integer;
            }

            int finalMax = max;
            arrayList.removeIf(n -> (n == finalMax));

            list.add(max);
        }

        return list;
    }
}