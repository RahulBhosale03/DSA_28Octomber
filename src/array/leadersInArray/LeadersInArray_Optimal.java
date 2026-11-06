package array.leadersInArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray_Optimal {
    public static void main(String[] args) {

        int [] nums = {1, 2, 5, 3, 1, 2};
        LeadersInArray_Brute obj = new LeadersInArray_Brute();
        List<Integer> result = obj.leaders(nums);
        System.out.println(result);
    }
    public List<Integer> leaders(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1;i >= 0;i--) {
            if (nums[i] >= maxRight) {
                list.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(list);
        return list;
    }
}
