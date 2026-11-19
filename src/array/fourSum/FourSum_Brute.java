package array.fourSum;


import java.util.*;

public class FourSum_Brute {

    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        FourSum_Brute obj = new FourSum_Brute();
        List<List<Integer>> result = obj.fourSum(nums,target);
        System.out.print(result);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List <Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i< nums.length;i++) {
            for (int j=i+1;j< nums.length;j++) {
                for(int k=j+1;k< nums.length;k++) {
                    for (int l=k+1;l< nums.length;l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
