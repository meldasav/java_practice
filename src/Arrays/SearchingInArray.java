package Arrays;

import java.util.Arrays;

public class SearchingInArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 10};
        //search for 7

        boolean has7 = false;
        for (int number : numbers) {
            if (number == 7) {
                has7 = true;
                break;
            }
        }
        System.out.println(has7);

        boolean has5 = false;
        for (int num : numbers) {
            if (num == 5) {
                has5 = true;
                break;
            }
        }
        System.out.println(has5);
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 7) >=0);
        System.out.println(Arrays.binarySearch(numbers, 5) >=0);

        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "ipad"};
        boolean hasMouse = false;
        for (String object : objects) {
            if (object.equals("Mouse")) {
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects,"Mouse")>=0);
    }
}
