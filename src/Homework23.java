import java.util.*;

public class Homework23 {
    public static void main(String[] args) {
        System.out.println(">>>>>>>TASK1<<<<<<<");
        System.out.println(parseData1("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        System.out.println(">>>>>>>TASK2<<<<<<<");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Mango", 1);
        System.out.println(calculateTotalPrice1(map));
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 2);
        map1.put("Pineapple", 1);
        map1.put("Orange", 3);
        System.out.println(calculateTotalPrice1(map1));
        System.out.println(">>>>>>>TASK3<<<<<<<");
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 4);
        map2.put("Mango", 8);
        map2.put("Orange", 3);
        System.out.println(calculateTotalPrice3(map2));
        System.out.println(maxSum(new int[]{4, 2, 5, 12, 20, 5, 23}, 3));
        System.out.println(maxSum(new int[]{100, 200, 600, 300}, 2));


    }

    //TASK 1
    public static TreeMap<String, String> parseData1(String str) {
        TreeMap<String, String> map = new TreeMap<>();
        String[] split = str.replaceAll("[{}]", " ").split(" ");
        for (int i = 1; i < split.length; i += 2) {
            map.put(split[i], split[i + 1]);
        }
        return map;
    }

    // TASK 1 // Akin solution
    public static TreeMap<String, String> parseData(String str) {
        TreeMap<String, String> dataTable = new TreeMap<>();
        while (str.contains("{")) {
            String key = str.substring(str.indexOf("{") + 1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}") + 1, str.indexOf("{")) : str.substring(1);
            if (str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable;
    }
    //TASK2

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        double totalPrice = 0.00;
        HashMap<String, Double> map1 = new HashMap<>();
        map1.put("Apple", 2.00);
        map1.put("Mango", 4.99);
        map1.put("Orange", 3.29);
        map1.put("Pineapple", 5.25);

        for (String s : map.keySet()) {
            totalPrice += map.get(s) * map1.get(s);
        }
        return totalPrice;


    }

    //TASK3
    public static double calculateTotalPrice2(Map<String, Integer> map) {
        Map<String, Double> totalShopping = new HashMap<>();
        totalShopping.put("Apple", 2.00);
        totalShopping.put("Orange", 3.29);
        totalShopping.put("Mango", 4.99);

        double totalPrice = 0.00;
        for (String value : map.keySet()) {
            for (int i = 1; i < map.get(value) + 1; i++) {
                if (map.containsKey("Apple") && i % 2 == 1) totalPrice += totalShopping.get(value) / 2.00;
                else if (map.containsKey("Mango") && i % 4 == 0) {
                } else totalPrice += totalShopping.get(value);
            }
        }
        return Math.round(totalPrice * 100.0) / 100.0;

    }

    //TASK3
    public static double calculateTotalPrice3(Map<String, Integer> gross) {
        double totalPrice = 0;
        Map<String, String> prices = new HashMap<>();
        prices.put("Apple", "$2.00");
        prices.put("Orange", "$3.29");
        prices.put("Mango", "$4.99");
        for (String product : gross.keySet()) {
            for (int i = 0; i < gross.get(product); i++) {
                if (product.equals("Apple") && i % 2 != 0)
                    totalPrice += Double.parseDouble(prices.get(product).substring(1)) * 0.50;
                else if (product.equals("Mango") && i % 4 == 3) continue;
                else totalPrice += Double.parseDouble(prices.get(product).substring(1));
            }
        }
        return (double) Math.round(totalPrice * 100) / 100;

    }

    //TODO /*
    //2 solutions - 5th of July
    //Create a method which will return the max of any consecutive k numbers from an array
    //arr = {4, 2, 5, 12, 20, 5, 23}, k = 3 ==> 48
    //arr = {100, 200, 600, 300}, k = 2     ==> 900
    //arr = {1, 2, 3}, k = 4                ==> -1
    // */
    public static int maxNumber(int[] array, int number) {
        if (number > array.length) return -1;//if giving number more than array size return -1
        int sum = 0;//first find the sum in giving size --> 4, 2, 5, 12, 20, 5, 23     number=3
        // 4 + 2 + 5=11  next 2+5+12=19 next 5 +12 +20=37 goes on
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        int maxSum = sum;
        int start = 0;
        for (int j = number; j < array.length; j++) { // 4, 2, 5, 12, 20, 5, 23
            sum += array[j] - array[start++];             //each time take off your start point
            if (maxSum < sum) maxSum = sum;

        }
        return maxSum;
    }

    public static int maxSum(int[] array, int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += array[i];
        }
        int maxTotal = 0;
        int start = 0;
        for (int i = number; i < array.length; i++) {
            sum += array[i] - array[start++];
            if (sum > maxTotal) maxTotal = sum;
        }
        return maxTotal;

    }
}
