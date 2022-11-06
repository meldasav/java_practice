package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _21_FooBarPractice {
    public static void main(String[] args) {
        lucky(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6, 9)));
        fullName(15);
    }

    public static void lucky(ArrayList<Integer> numbers) {
        for (int i = 1; i <= numbers.size(); i++) {
            if (i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    public static void fullName(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("Melda Sav");
            else if (i % 5 == 0) System.out.println("Sav");
            else if (i % 3 == 0) System.out.println("Melda");
            else System.out.println(i);
        }
    }
}

