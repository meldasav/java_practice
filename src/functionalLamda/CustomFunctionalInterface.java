package functionalLamda;

public class CustomFunctionalInterface {
    public static void main(String[] args) {
        StringFunctions longestString = (s1, s2) -> {
            if (s1.length() > s2.length())
                return s1;
            return s2;
        };

        //"java" "C#
        System.out.println(longestString.function("java", "C#"));

        DataFunction<String> reverse = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--)
                result += s.charAt(i);
            return result;
        };
        System.out.println( reverse.function("CyberTek"));

        DataFunction<Integer> cube=n->n*n*n;
        System.out.println(cube.function(10));



    }
}
