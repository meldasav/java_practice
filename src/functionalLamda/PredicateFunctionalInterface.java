package functionalLamda;

import java.util.*;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {

    Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(1002));

        List<String> list=new ArrayList<>(Arrays.asList("java","C#","C#","C++"));
        Predicate<String> isUnique= p-> Collections.frequency(list,p)==1;
        System.out.println(isUnique.test("C#"));


}

}
