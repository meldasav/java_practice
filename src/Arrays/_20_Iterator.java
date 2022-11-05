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

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Pen", "Pencil", "Book", "Notebook", "MacBook Pro"));
           objects.removeIf(o->o.toLowerCase().contains("book"));
           System.out.println(objects);
        Iterator<String> iterator1 = objects.iterator();
        while (iterator1.hasNext()) {
            String o = iterator1.next();
            if (o.toLowerCase().contains("book")) iterator1.remove();
        }
        System.out.println(objects);
    }
}
