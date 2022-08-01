import java.util.*;

public class Practice11 {
    public static void main(String[] args) {
        System.out.println(middleNumber(10, 6, 2));
        System.out.println(reverse2("MeldaSav"));
        System.out.println(removeDigits4("TARIK1983"));
        System.out.println(removeSpace3("java is fun"));
        System.out.println(removeSpecials("$109.00"));
        System.out.println(removeVowels("MeldaSAV"));
        oddNumber(10);
        System.out.println(Arrays.toString(removeDuplicate(new int[]{0, 5, 4, 0, 0})));
        System.out.println(Arrays.toString(removeDup(new String[]{"Tarik", "Kerem", "MEL", "JOHN", "MEL", "Kerem"})));
        System.out.println(isPalindrome("tarik"));
        fibonacci(8);
        System.out.println(countSpace("java is fun to learn"));
        System.out.println(countWord("school is ending soon"));
        System.out.println(removeExtraSpace("JAVA    IS     FUN"));
        System.out.println(reverseEach("java is fun"));
        System.out.println(secondMax1(new int[]{1, 2, 7, 9}));
        System.out.println(countCharacter("Sweet banana"));
       ;
    }

    public static int greatestNumber1(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static int greatestNumber2(int num1, int num2, int num3) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        return numbers.last();
    }

    public static int countWord(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') count++;
        }
        return count + 1;
    }

    public static int greatestNumber3(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int greatestNumber4(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) return num1;
        else if (num2 >= num1 && num2 >= num3) return num2;
        else return num3;
    }

    public static int middleNumber(int num1, int num2, int num3) {
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));


        if (num1 > min && num1 != max) return num1;
        else if (num2 > min && num2 != max) return num2;
        else return num3;
    }

    public static String reverse1(String fullName) {
        return new StringBuilder(fullName).reverse().toString();
    }

    public static String reverse2(String fullName) {
        StringBuilder reverseFullName = new StringBuilder();
        for (int i = fullName.length() - 1; i >= 0; i--) {
            reverseFullName.append(fullName.charAt(i));
        }
        return reverseFullName.toString();
    }

    public static String removeDigits1(String word) {
        StringBuilder withOutDigits = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!Character.isDigit(c)) {
                withOutDigits.append(c);
            }
        }
        return withOutDigits.toString();
    }

    public static String removeDigits2(String word) {
        return word.replaceAll("[0-9]", "");
    }

    public static String removeDigits3(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeDigits4(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeSpace1(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isWhitespace(sentence.charAt(i))) {
                sb.append(sentence.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeSpace2(String sentence) {
        return sentence.replaceAll(" ", "");
    }

    public static String removeSpace3(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                sb.append(sentence.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeSpecials(String str) {
        return str.replaceAll("[^a-zA-Z-0-9 ]", "");
    }

    public static String removeVowels(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void oddNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static int[] removeDuplicate(int[] array) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : array) {
            numbers.add(num);
        }
        ArrayList<Integer> newArrayList = new ArrayList<>(numbers);
        int[] newArray = new int[newArrayList.size()];
        for (int i = 0; i < newArrayList.size(); i++) {
            newArray[i] = newArrayList.get(i);
        }
        return newArray;
    }

    public static String[] removeDup(String[] array) {
        HashSet<String> set = new HashSet<>(Arrays.asList(array));
        ArrayList<String> list = new ArrayList<>(set);
        String[] newArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }

    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        return word.equals(sb.toString());
    }

    public static void fibonacci(int number) {
        int num1 = 0, num2 = 1, num3;
        for (int i = 0; i <= number; i++) {
            System.out.println(num1);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

    public static int countSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) count++;
        }
        return count;
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' || str.charAt(i + 1) != ' ') sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static String reverseEach(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            int temp = number;
            for (int i = 2; i < temp; i++) {
                number *= i;
            }
        }
        return number;
    }

    public static int secondMax(int[] array) {
        int max = 0;
        int secondMax = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        for (int i : array) {
            if (i != max && secondMax < i) secondMax = i;
        }
        return secondMax;
    }

    public static int secondMax1(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : array) set.add(num);
        ArrayList<Integer> list = new ArrayList<>(set);
        return list.get(list.size() - 2);
    }
    public static LinkedHashMap<Character,Integer> countCharacter(String str){
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(Character c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return map;
    }
}
