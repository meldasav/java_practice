import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOf2Numbers {
    public static void main(String[] args) {

        String results = "About 20,100,000 results (0.38 seconds)";
        String split = results.split(" ")[1].replaceAll(",", "");
        System.out.println(Long.parseLong(split)>0);

        String price="$20,536";
        String validatePrice=price.substring(1).replace(",","");
        System.out.println(validatePrice);
        System.out.println(Integer.parseInt(validatePrice)>0);


        System.out.println(Arrays.toString(sumOfTwoNumbers(7, new int[]{2, 3, 7, 4, 8})));
    }

    public static int[] sumOfTwoNumbers(int target, int[] number) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < number.length; i++) {
            int temp = target - number[i];
            if (map.containsKey(temp)) {
                return new int[]{i, map.get(temp)};
            }
            map.put(number[i], i);
        }
        return new int[]{-1, -1};
    }




}
