import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class _04LinkList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6));
        LinkedList<Integer> linkedList = new LinkedList<>(set);
        System.out.println(linkedList.getFirst());//get the first element
        System.out.println(linkedList);
        System.out.println(linkedList.getLast());//get the last element
        System.out.println("Before pollLast" + linkedList);
        System.out.println(linkedList.pollLast());//print last element and remove the last element
        System.out.println("After pollLast method" + linkedList);
        System.out.println(linkedList.poll());//return first element and remove from collection
        linkedList.removeIf(x -> x == 4);
        System.out.println(linkedList);
        linkedList.add(2);//add the 2 to the end
        linkedList.offerFirst(2);//add the 2 at first
        System.out.println("Before removeFirst" + linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println("After removeFirst" + linkedList);

    }
}
