import java.util.Arrays;

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
        boolean hasDuplicate=false;
        char[] c = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (!s.toString().contains(c[i] + "") && (c[i] + "").equalsIgnoreCase(c[j] + "")){
                    s.append(c[i]);
                    System.out.println(c[i]);
                    hasDuplicate=true;
                }
            }
        }
        if(!hasDuplicate) System.out.println("There is no duplicated");

    }
}

