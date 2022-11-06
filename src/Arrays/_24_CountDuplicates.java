package Arrays;

import java.util.ArrayList;

public class _24_CountDuplicates {
    public static void main(String[] args) {
        countDuplicates(new int[]{1, 1, 2, 2, 0, 0, 9, 9});
    }

    public static void countDuplicates(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int number : numbers) list.add(number);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    duplicates.add(list.get(i));
                }
            }
        }
        System.out.println("Total of duplicates element : " + duplicates.size());
        System.out.println(duplicates);
    }
}
