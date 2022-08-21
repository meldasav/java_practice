package interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Parse_Data {
    public static void main(String[] args) {
        String data = "{104}LA{101}Paris";
        System.out.println(parseData(data));


        String str1 = "I am an QA automation Tester";
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
        for (String s : str1.split(" ")){
            if(map1.containsKey(s))map1.put(s,map1.get(s)+1);
            else map1.put(s,1);
        }
        System.out.println(map1);

            String str = "I am an QA automation Tester";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
    public static TreeMap<String, String> parseData(String str){
        TreeMap<String,String> set= new TreeMap<>();
        for(String keyValue : str.split("\\{")){
            if(!keyValue.isEmpty()){
                String key=keyValue.substring(0,keyValue.indexOf('}'));
                String value=keyValue.substring(keyValue.indexOf('}')+1);
                set.put(key,value);
            }
        }
        return set;
    }



}
