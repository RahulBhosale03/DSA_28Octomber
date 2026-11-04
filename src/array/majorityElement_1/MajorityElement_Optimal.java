package array.majorityElement_1;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_Optimal {
    public static void main(String[] args) {
        int [] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int result = Majority(nums);
        System.out.println(result);
    }

    public static int Majority(int [] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0;i< nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);

            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
