import java.util.*;

public class _01HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(Arrays.asList(1,1,2,3,4,5));
        System.out.println(set);
        ArrayList<Integer> list=new ArrayList<>(set);
        System.out.println(list.get(list.size()-2));
        //hashset does not have much method


        HashSet<Integer> set1=new HashSet<>(Arrays.asList(1,1,2,3,4,5));
        ArrayList<Integer> list1=new ArrayList<>(set1);
        System.out.println(list1);


    }
}
