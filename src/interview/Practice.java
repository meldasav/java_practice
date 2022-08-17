package interview;

public class Practice {
    public static void main(String[] args) {


        String str = "JAVA IS FUN";
        System.out.println(str.substring(str.lastIndexOf(" ") + 1) + str.substring(str.indexOf(" "), str.lastIndexOf(" ")) + " " + str.substring(0, str.indexOf(" ")));
    }

}
