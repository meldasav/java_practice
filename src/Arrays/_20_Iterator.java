package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _20_Iterator {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Pasta", "Burger", "Lamb chops", "Salad", "Falafel", "Sushi"));
        //   food.removeIf(x->x.length()==5);
        //   System.out.println(food);
        Iterator<String> iterator = food.iterator();
        while (iterator.hasNext()) {
            String f = iterator.next();
            if (f.length() == 5) iterator.remove();
        }
        System.out.println(food);
    }
}
