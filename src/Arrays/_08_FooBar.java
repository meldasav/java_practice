package Arrays;

import java.util.Scanner;

public class _08_FooBar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int number= scan.nextInt();
        for (int i = 1; i <=number; i++) {
            if(i%6==0) System.out.println("FooBar");
            else if(i%2==0) System.out.println("Foo");
            else if(i%3==0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
