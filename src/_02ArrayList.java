import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Melda","Kerem-Tarik"));
        System.out.println(list);
        list.add(1,"Sav");
        System.out.println(list.set(1,"Gulsever"));
        list.add(3,"Gulsever");
        list.remove("Sav");
        System.out.println(list);
        LinkedList<String> myList=new LinkedList<>(list);
        myList.remove("Gulsever");
        System.out.println(myList.getFirst());

        //Retrieving objects from the ArrayList using get(index) method
        System.out.println(list.get(0).toLowerCase().charAt(0));
        //Clearing the ArrayList - removing all elements using clear() method
        list.clear();
        System.out.println(list);//[]
        //Printing each object in the ArrayList using enhanced for loop
        for (String s : myList) {
            System.out.println(s);
        }
        //Remove all cities that starts with letter B using removeIf() method

    }
}
