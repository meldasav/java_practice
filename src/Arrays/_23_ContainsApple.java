package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _23_ContainsApple {
    public static void main(String[] args) {
        System.out.println(containApple(new ArrayList<>(Arrays.asList("APPLE", "apple", "banana", "kiwi"))));
        System.out.println(containApple1(new ArrayList<>(Arrays.asList("APPLE", "apple", "banana", "kiwi"))));
        System.out.println(containApple(new ArrayList<>(Arrays.asList("APPle", "aPPle"))));
        commonElements(new ArrayList<>(Arrays.asList(10,20,30)),new ArrayList<>(Arrays.asList(10,20,40)));


        //TODO REPLACE EVERY 2 WITH 7
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 2));
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 2) {
                numbers.set(i, 7);
            }
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) iterator.remove();
        }
        System.out.println(numbers);
        for (int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println(numbers);
    }


    public static boolean containApple(ArrayList<String> list) {
        return list.toString().toLowerCase().contains("apple");
    }

    public static boolean containApple1(ArrayList<String> fruits) {
        for (String fruit : fruits) {
            if (fruit.equalsIgnoreCase("apple")) return true;
        }
        return false;
    }
  public static void commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3=new ArrayList<>();
      for (int i = 0; i < list1.size(); i++) {
          for (int j = 0; j < list2.size(); j++) {
              if(list1.get(i)==list2.get(j)){
                  list3.add(list1.get(i));
              }
          }
      }
      System.out.println(list3);
  }
}
