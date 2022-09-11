import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("What is the temperature today");
        int temperature=scan.nextInt();
        System.out.println(temperature==60 ? "true" :"false");
    }


}
