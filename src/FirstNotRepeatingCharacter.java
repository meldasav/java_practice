import java.util.HashMap;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNotRepeatingCharacter("abcdeabcd"));

    }

    public static char firstNotRepeatingCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : str.toCharArray()) {
            if (map.containsKey(character)) map.put(character, map.get(character) + 1);
            else map.put(character, 1);
        }
        for (Character c : str.toCharArray()) {
            if (map.get(c) == 1) return c;
        }
        return '_';
    }
}
