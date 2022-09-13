package java_coding_exercises;

import java.util.Arrays;

public class _30_Find_If_2_Strings_Are_Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("cinema","iceman"));

    }
    public static boolean anagram(String str1,String str2){
        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
