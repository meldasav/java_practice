package Arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class _18_RemoveElementFromLinkList {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>(Arrays.asList("Java", "#C", "Java Script", "Python","java"));
        languages.removeIf(x->Character.isUpperCase(x.charAt(0)) || !Character.isLetter(x.charAt(0)));
        System.out.println(languages);
        languages.removeIf(x -> x.length() > 5);
        System.out.println(languages);
        languages.removeIf(x -> x.toLowerCase().startsWith("j"));
        System.out.println(languages);
        LinkedList<String> list1 = new LinkedList<>();
        for (String language : languages) {
            if (language.toLowerCase().startsWith("j")) {
                continue;
            }
            list1.add(language);
        }
        System.out.println(list1);
    }
}
