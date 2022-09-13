package java_coding_exercises;

public class _43_Remove_Extra_Spaces_In_A_String {
    public static void main(String[] args) {
        System.out.println(removeExtraSpace("  Melda   Sav    "));
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
