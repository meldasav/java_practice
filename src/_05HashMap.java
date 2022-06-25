import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class _05HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> compMap = new HashMap<>();
        compMap.put("Google", 10000);
        compMap.put("Walmart", 20000);
        compMap.put("Amazon", 30000);
        compMap.put("Facebook", 5000);
        compMap.put("Sysco", 15000);
        compMap.forEach((k, v) -> System.out.println("key value = " + k + " value = " + v));
        System.out.println(compMap.keySet());
        System.out.println(compMap.entrySet());
        System.out.println(compMap);
        System.out.println(compMap(compMap));
        System.out.println(compMap1(compMap));

        Map<String, String> map = new HashMap<>();
        map.put("Melda", "Sav");
        map.put("Kerem", "Gulsever");
        for (String str : map.keySet()) {
        //    System.out.println(str);
            System.out.println(map.get(str));
        }

    }

    public static ArrayList<Integer> compMap(HashMap<String, Integer> map) {
        ArrayList<Integer> newList = new ArrayList<>((map.values()));
        for (Integer list : newList) {
            if (!newList.contains(list)) newList.add(list);
        }
        return newList;
    }

    public static ArrayList<String> compMap1(HashMap<String, Integer> map) {
        ArrayList<String> newList = new ArrayList<>((map.keySet()));
        for (String list : newList) {
            if (!newList.contains(list)) newList.add(list);
        }
        return newList;

    }
}