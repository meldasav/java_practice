package Arrays;

import java.util.Arrays;
import java.util.Vector;

public class _19_CountElement {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(Arrays.asList(10,15,20,25,30));
        System.out.println(vector.stream().filter(x->x%2==0).count());
    }
}
