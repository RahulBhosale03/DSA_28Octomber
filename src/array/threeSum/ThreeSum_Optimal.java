package array.threeSum;

import java.util.*;

public class ThreeSum_Optimal {
    public static void main(String[] args) {

        int [] nums = {-1,0,1,2,-1,-4};
        ThreeSum_Optimal obj = new ThreeSum_Optimal();
        List<List<Integer>> res = obj.threeSum(nums);
        System.out.println(res);
    }
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++) {
            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return new ArrayList<>(list);
    }
}
