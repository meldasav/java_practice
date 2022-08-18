package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Return_Indicies_Of_Element {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{4, -2, 5, 0, 6, 3, 2, 7}, 1)));

    }
    public static  int[] twoSum(int[] nums,int target){

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int cur=nums[i];
            int x=target-cur;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(cur,i);
        }
        return null;
    }
}
