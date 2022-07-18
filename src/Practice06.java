import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your address");
        String address = scan.nextLine();
        address = address.toLowerCase();

        if (!address.isEmpty()) {
            switch (address) {
                case "chicago":
                    System.out.println("You are in the club");
                    break;
                case "des plaines":
                    System.out.println("You are welcome to join the club");
                    break;
                default:
                    System.out.println("Sorry, you will never be in the club");
            }
        }
        /**
         * Write a program that asks user to enter their colors, at least 4 colors
         * Check If those colors contains “red” and “green”
         * If “green” is listed in favorite colors, then print “Green is in the list”
         * If “red” is listed in favorite colors, then print “Red is in the list”
         * If both “green” and “red” are listed in favorite colors, then print “Green and red are in the list”
         * If both “green” and “red” are not listed in favorite colors, then print “Green and red are not in the list”
         */
        System.out.println("Please enter your favorite colors");
        String colors = scan.next().toLowerCase() + ",";
        colors += scan.next().toLowerCase() + ",";
        colors += scan.next().toLowerCase() + ",";
        colors += scan.next().toLowerCase() + ",";
        String favoriteColor1 = "red";
        String favoriteColor2 = "green";

        if (colors.contains(favoriteColor1) && colors.contains(favoriteColor2)) {
            System.out.println("Green and red are in the list");
        } else if (colors.contains(favoriteColor1)) System.out.println("red is in the list");
        else if (colors.contains(favoriteColor2)) System.out.println("green is in the list");
        else System.out.println(" green and red are not in the list");

        System.out.println("Task 4");
        String str = "   Java is FUN   ";
        str = str.trim().toLowerCase();

        for (int i = 0; i < str.length(); i++) {
        }
        System.out.println("first word is " + str.substring(0, str.indexOf(" ")));
        System.out.println("second word is " + str.substring(str.indexOf(" ") + 1, str.lastIndexOf(" ")));
        System.out.println("last word is " + str.substring(str.lastIndexOf(" ") + 1));


    }
}

