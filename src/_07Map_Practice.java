import java.util.HashMap;
import java.util.Map;

public class _07Map_Practice {


    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<TASK 1>>>>>>>>>>");
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 45);
        map.put("Jane", 25);
        map.put("Alex", 18);
        map.put("Max", 29);

        System.out.println(youngestPerson(map));

        System.out.println("<<<<<<<<<<TASK 2>>>>>>>>>>");
        Map<String, Double> map1 = new HashMap<>();
        map1.put("Pen", 5.99);
        map1.put("Book", 20.99);
        map1.put("NoteBook", 20.98);
        map1.put("Pencil", 9.99);

        System.out.println(mostExpensiveBook(map1));

        System.out.println("..........TASK 3..........");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Mercedes", 10);
        map2.put("Audi", 25);
        map2.put("Tesla", 5);
        map2.put("BMW", 26);

        System.out.println(mostCountedCar(map2));

        System.out.println("..........TASK 4..........");
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("Apple", 3);
        map3.put("Egg", 20);
        map3.put("Eggplant", 2);
        map3.put("Melon", 1);

        System.out.println(leastNeeded(map3));
    }

    //TODO TASK 1

    /**
     * -Assume that you are given some student names and their ages as below.
     * John, 45
     * Jane, 25
     * Alex, 18
     * Max, 29
     * -   Write a method that returns the youngest person with
     * below message
     * Expected
     * <p>
     * Alex is the youngest and the age is 18.
     */
    public static String youngestPerson(Map<String, Integer> map) {
        int youngestAge = Integer.MAX_VALUE;
        String name = "";
        for (String key : map.keySet()) {
            if (map.get(key) < youngestAge) {
                youngestAge = map.get(key);
                name = key;
            }
        }
        return name + " is the youngest and the age is " + youngestAge;

    }
    //TODO TASK 2

    /**
     * -Assume that you are given some product names and their prices as below
     * Pen, 5.99
     * Book,20.99
     * NoteBook,20.98
     * Pencil, 9.99
     * <p>
     * Write a method that returns the most expensive product with below message
     * <p>
     * Book is the most expensive and the price is $20.99
     */

    public static String mostExpensiveBook(Map<String, Double> map) {
        double mostExpensive = Integer.MIN_VALUE;
        String bookName = "";

        for (String key : map.keySet()) {
            if (map.get(key) > mostExpensive) {
                mostExpensive = map.get(key);
                bookName = key;
            }
        }
        return bookName + "is the most expensive and the price is " + mostExpensive;
    }
    //TODO TASK 3

    /**
     * -Assume that you are given some car inventory with car names and their quantities as below
     * Mercedes ,10
     * Audi,25
     * Tesla,5
     * BMW,26
     * Write a method that returns the most counted cars with below message
     * <p>
     * BMW is the most counted car in  the inventory and the quantity is 26
     */

    public static String mostCountedCar(Map<String, Integer> map) {
        int mostCounted = Integer.MIN_VALUE;
        String carName = "";

        for (String key : map.keySet()) {
            if (map.get(key) > mostCounted) {
                mostCounted = map.get(key);
                carName = key;
            }
        }
        return carName + " is the most counted car in  the inventory and the quantity is " + mostCounted;
    }
    //TODO TASK 3

    /**
     * -Assume that you are given a shopping list as below with their quantities needed
     * Apple,3
     * Egg,20
     * Eggplant,2
     * Melon,1
     * Write a method that returns the least needed product with below message
     * Melon is the least needed and the quantity is 1
     */

    public static String leastNeeded(Map<String, Integer> map) {
        int leastNeeded = Integer.MAX_VALUE;
        String shoppingItems = "";

        for (String key : map.keySet()) {
            if (map.get(key) < leastNeeded) {
                leastNeeded = map.get(key);
                shoppingItems = key;
            }
        }
        return shoppingItems + " is the least needed and the quantity is " + leastNeeded;
    }

}
