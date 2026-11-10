package array.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Optimal {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        TwoSum_Optimal obj = new TwoSum_Optimal();
        int [] ans = obj.twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< nums.length;i++) {
            int result = target - nums[i];

            if (map.containsKey(result)) {
                return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
