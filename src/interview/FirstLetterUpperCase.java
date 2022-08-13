package interview;

public class FirstLetterUpperCase {
    public static void main(String[] args) {
        String str = "THE QUICK BROWN FOX";
        System.out.println(lowerCaseFirstLetter(str));

    }

    public static String lowerCaseFirstLetter(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if(!s.isEmpty())sb.append(s.substring(0, 1).toLowerCase()).append(s.substring(1));
            sb.append(" ");
        }
        return sb.toString();
    }
}

