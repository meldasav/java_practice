package generics;

import java.util.HashMap;
import java.util.Map;

public class Mock {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 45);
        map.put("Jane", 25);
        map.put("Alex", 18);
        map.put("Max", 29);
        System.out.println(youngestAge(map));
    }
    /*
    Requirement:
NOTE: With this task, student will decide which data
structure to use, and they are responsible to come up with
logic – pseudo code.
Student is also responsible to create a main method and
test their method.
-Assume that you are given some student names and their ages as
below.
John, 45
Jane, 25
Alex, 18
Max, 29
-Write a method that returns the youngest person with
below message
Expected
:
Alex is the youngest and the age is 18.
     */

    public static String youngestAge(Map<String,Integer> map){
        int youngestAge=Integer.MAX_VALUE;
        String name="";

        for (String key : map.keySet()){
            if(map.get(key)<youngestAge){
                youngestAge=map.get(key);
                name=key;
            }
        }
        return name + "" +youngestAge;

    }



}
