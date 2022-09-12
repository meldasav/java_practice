package interview;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        System.out.println(removeExtraSpace1("    java    is       fun      "));
    }

    public static String removeExtraSpace(String sentence) {
        StringBuilder sb = new StringBuilder();
        sentence = sentence.trim();
        for (String s : sentence.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String removeExtraSpace1(String sentence) {
        return sentence.trim().replaceAll("\\s+", " ");
    }

}


