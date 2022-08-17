import java.util.HashMap;

public class CountDuplicatesInString {
    public static void main(String[] args) {
        countDuplicates("i am am learning java java");
        countDuplicateCharacter1("melda");

    }

    //TODO (the word java appeared 2 times)
    //TODO (the word am appeared 2 times)

    public static void countDuplicates(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : str.split(" ")) {
            if (map.containsKey(s)) map.put(s, map.get(s) + 1);
            else map.put(s, 1);
        }
        for (String temp : map.keySet()) {
            if (map.get(temp) > 1) System.out.println("the word " + temp + " appeared " + map.get(temp) + " times");
        }
    }

    //TODO The character a appeared 3 times
    //TODO The character j appeared 3 times

    public static void countDuplicateCharacter1(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        for (Character c : map.keySet()) {
            if (map.get(c) > 1) System.out.println("The character " + c + " appeared " + map.get(c) + " times");
        }
    }


}
