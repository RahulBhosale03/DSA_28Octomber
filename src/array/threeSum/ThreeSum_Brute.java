package array.threeSum;

import java.util.*;

public class ThreeSum_Brute {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        ThreeSum_Brute obj = new ThreeSum_Brute();
        List<List<Integer>> res = obj.threeSum(nums);
        System.out.println(res);
    }
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> list = new HashSet<>();

        for(int i=0;i< nums.length;i++) {
            for (int j=i+1;j< nums.length;j++) {
                for(int k=j+1;k< nums.length;k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return new ArrayList<>(list);
    }
}
