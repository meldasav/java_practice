package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _16_FindAllDuplicates {
    public static void main(String[] args) {
        AllDuplicates(new String[]{"Foo","Bar","Foo","FOO"});
        AllDuplicates1(new String[]{"Foo","Bar","Foo","FOO"});
    }
    public static void AllDuplicates(String[] words) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list1.add(list.get(i));
                }
            }
        }
        System.out.println(list1);
    }
    public static void AllDuplicates1(String[] words) {
        String duplicates="";
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if(!duplicates.contains(words[i]) && words[i].equals(words[j])){
                    System.out.println(words[i]);
                }
            }
        }
    }
}
