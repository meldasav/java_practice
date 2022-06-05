import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Mock_Interview {
    public static void main(String[] args) {
        System.out.println(countElements(new String[]{"Apple", "Apple", "Orange", "Apple", "Kiwi"}));



    }
    public static Map<String,Integer> countElements(String[] str){
       Map<String,Integer> map=new LinkedHashMap<>();
       for(String c : str){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }
           else{
               map.put(c,1);
           }
       }
       return map;
    }



}
