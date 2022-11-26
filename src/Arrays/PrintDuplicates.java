package Arrays;

import java.util.ArrayList;

public class PrintDuplicates {
    public static void main(String[] args) {
        printDuplicates(new String[]{"a","t","o","m","a","u","t","i","O","N"});//a,t,o
    }
    public static void printDuplicates(String[] array){

        ArrayList<String> dup=new ArrayList<>();

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i].equalsIgnoreCase(array[j]) &&
                   !dup.contains(array[i])){
                    dup.add(array[i]);
                }
            }
        }
        System.out.println(dup);
    }
}
