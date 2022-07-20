import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 5 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean firstPositive = false;
        boolean firstNegative = false;
        for (int number : numbers) {
            if (!firstPositive && number > 0) {
                firstPositive = true;
                System.out.println(number);
            } else if (!firstNegative && number < 0) {
                firstNegative = true;
                System.out.println(number);
            }
            if (firstPositive && firstNegative) break;
        }
        if (!firstNegative) System.out.println("There is no negative number");
        if (!firstPositive) System.out.println("There is no positive number");

        int number1 = (int) (Math.random() * 10) + 1;
        int number2 = (int) (Math.random() * 10) + 1;
        int number3 = (int) (Math.random() * 10) + 1;
        int number4 = (int) (Math.random() * 10) + 1;
        int number5 = (int) (Math.random() * 10) + 1;

        int[] numberS = {number1, number2, number3, number4, number5};
        Arrays.sort(numberS);
        System.out.println(Arrays.toString(numberS));
        System.out.println(Arrays.binarySearch(numberS, 2) >= 0 || Arrays.binarySearch(numberS, 3) >= 0);

        String[] list = {"banana", "orange", "Apple"};
        boolean hasApple = false;
        for (String s : list) {
            if (s.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);
        System.out.println("---------------------------");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean matchingNumbers = false;
        for (int j : numbers1) {
            for (int k : numbers2) {
                if (j == k) {
                    System.out.println(j);
                    matchingNumbers = true;
                    break;
                }
            }
        }
        if (!matchingNumbers) System.out.println("There is no matching numbers");

        System.out.println("-----------------------------------");
        String str = "baNana";
        str = str.toLowerCase();
        boolean hasDuplicate = false;
        char[] c = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (!s.toString().contains(c[i] + "") && (c[i] + "").equalsIgnoreCase(c[j] + "")) {
                    s.append(c[i]);
                    System.out.println(c[i]);
                    hasDuplicate = true;
                }
            }
        }
        if (!hasDuplicate) System.out.println("There is no duplicated");
        System.out.println("-------------------------------");
        int[] numbersS = {1, 5, -4, -4, 0, -7, 0, 5, 10, 45, 45};
        boolean firstDuplicate = false;
        for (int i = 0; i < numbersS.length; i++) {
            for (int j = i + 1; j < numbersS.length; j++) {
                if (numbersS[i] == numbersS[j] && !firstDuplicate) {
                    System.out.println(numbersS[i]);
                    firstDuplicate = true;
                    break;
                }
            }
        }
        System.out.println("_______________________________");
        String[] words = {"Z", "abc", "z", "123", "#"};
        boolean firstDup = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!firstDup && words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    firstDup = true;
                    break;
                }
            }
            if (!firstDup) System.out.println("There is no dup");

        }
        System.out.println("______________________________");
        int[] numbersSS = {-4, -7, 0, 5, 10, 45};
        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int i = 0; i < numbersSS.length; i++) {
            for (int j = i + 1; j < numbersSS.length; j++) {
                if (!duplicateNumbers.contains(numbersSS[i]) && numbersSS[i] == numbersSS[j]) {
                    duplicateNumbers.add(numbersSS[i]);
                }
            }
        }
        if (duplicateNumbers.size() == 0) System.out.println("There is no Dup");
        else {
            for (Integer duplicateNumber : duplicateNumbers) {
                System.out.println(duplicateNumber);
            }
        }
        System.out.println("_____________________________");
        String[] wordsS = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        List<String> lisT = new ArrayList<>();
        for (int i = 0; i < wordsS.length; i++) {
            for (int j = i + 1; j < wordsS.length; j++) {
                if (!lisT.contains(wordsS[i]) && wordsS[i].equalsIgnoreCase(wordsS[j])) {
                    lisT.add(wordsS[i]);
                }
            }
        }
        if (lisT.size() == 0) System.out.println("There is no duplicates");
        else {
            for (int i = 0; i < lisT.size(); i++) {
                for (int j = i + 1; j < lisT.size(); j++) {
                    if (!lisT.get(i).equalsIgnoreCase(lisT.get(j))) {
                        System.out.println(lisT.get(i));
                    }
                }
            }
        }
    }
}




