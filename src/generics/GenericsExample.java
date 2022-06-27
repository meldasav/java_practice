package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        //  TODO generics does not work with primitive types needs tobe Object
        Printer<Cat> printer = new Printer<>(new Cat());
        printer.print();

        Printer<Dog> printer1 = new Printer<>(new Dog());
        printer1.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat myCat = (Cat) cats.get(0);

        shout("Melda", 39);
        shout(39, "Melda");
        shout(new Cat(), new Dog());

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout);
    }
     //TODO Wildcard <?>
    private static void printList(List<?> myList) {
        System.out.println();
    }
}