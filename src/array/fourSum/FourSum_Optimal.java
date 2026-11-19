package array.fourSum;

import java.util.*;

public class FourSum_Optimal {
    public static void main(String[] args) {

        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        FourSum_Optimal obj = new FourSum_Optimal();
        List<List<Integer>> result = obj.fourSum(nums,target);
        System.out.print(result);

    }
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i< nums.length - 3;i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<nums.length - 2;j++) {
                if(j < nums.length && nums[j] == nums[j-1])continue;

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        left++;
                    }else if (sum > target) {
                        right--;
                    }else {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (right < right && nums[right] == nums[right + 1]) right--;
                    }
                }
            }
        }
        return list;
    }
}
