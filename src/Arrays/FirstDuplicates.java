package Arrays;

import java.util.ArrayList;

public class FirstDuplicates {
    public static void main(String[] args) {
        firstDup(new int[]{1,3,4,2,3,5,4});

    }
    public static void firstDup(int[] numbers){
        ArrayList<Integer> numberList=new ArrayList<>();

        for (int integer : numbers) {
            if(numberList.contains(integer)){
                System.out.println(integer);
                break;
            }else{
                numberList.add(integer);
            }
        }
    }
}
