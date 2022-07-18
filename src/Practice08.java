import java.util.Arrays;

public class Practice08 {
    public static void main(String[] args) {
        String[] countries = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        Arrays.sort(countries);
        System.out.println(Arrays.binarySearch(countries, "Pluto") > 0);

        String[] cartoons = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoons);
        System.out.println(Arrays.binarySearch(cartoons, "Garfield") > 0 || Arrays.binarySearch(cartoons, "Felix") > 0);

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        int letters = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int digits = 0;
        int specials = 0;
        int space = 0;

        for (char character : characters) {
            if (Character.isLetter(character)) {
                letters++;
                if (Character.isLowerCase(character)) lowerCase++;
                else upperCase++;
            }
            else if (Character.isDigit(character)) digits++;
            else if (Character.isWhitespace(character)) space++;
            else specials++;
        }

        System.out.println("Letters:  " + letters);
        System.out.println("UpperCase letters:  " + upperCase);
        System.out.println("LowerCase letters: " + lowerCase);
        System.out.println("Digits: " + digits);
        System.out.println("Specials: " + specials);
        System.out.println(space);

        System.out.println("Task 9");
        String[] objects={"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upper=0;
        int lower=0;
        int startBorP=0;
        int bookOrPen=0;

       for (String c : objects){
           if(Character.isUpperCase(c.charAt(0)))upper++;
           else lower++;
           c=c.toLowerCase();
           if(c.startsWith("b") || c.startsWith("p"))startBorP++;
           if(c.contains("book") || c.contains("pen"))bookOrPen++;
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(startBorP);
        System.out.println(bookOrPen);

        int[] numbers={3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int moreThan10=0;
        int equal10=0;
        int lessThan10=0;
        for (int number : numbers) {
            if (number > 10) moreThan10++;
            else if (number == 10) equal10++;
            else lessThan10++;
        }
        System.out.println(moreThan10);
        System.out.println(equal10);
        System.out.println(lessThan10);


        int[] first={5, 8, 13, 1, 2};
        int[] second={9, 3, 67, 1, 0};
        int[] third=new int[5];
        for (int i = 0; i < third.length; i++) {
            third[i]=Math.max(first[i],second[i]);
        }
        System.out.println(Arrays.toString(third));
        }
    }

