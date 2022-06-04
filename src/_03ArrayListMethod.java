import java.util.ArrayList;
import java.util.Arrays;

public class _03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 0));
        System.out.println(list.get(0));//Print first element
        list.removeIf(x -> x == 0);
        System.out.println(list);
        list.clear();//clear the elements return nothing

    }
}
