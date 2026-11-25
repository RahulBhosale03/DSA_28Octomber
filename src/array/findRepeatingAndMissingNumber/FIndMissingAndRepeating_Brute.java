package array.findRepeatingAndMissingNumber;

import java.util.Arrays;

public class FIndMissingAndRepeating_Brute {
    public static void main(String[] args) {

        int [] nums = {3, 5, 4, 1, 1};
        FIndMissingAndRepeating_Brute obj = new FIndMissingAndRepeating_Brute();
        int [] result = obj.findMissingRepeatingNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] findMissingRepeatingNumbers(int[] nums) {

        int repeating = 0;
        int missing = 0;

        for(int i=0;i< nums.length;i++) {
            int count = 0;
            for(int j=0;j< nums.length;j++) {
                if(i != j && nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > 0) {
                repeating = nums[i];
            }
        }
        for(int k=1;k<=nums.length;k++) {
            missing = missing ^ k;
        }
        for(int num : nums) {
            missing = missing ^ num;
        }
        missing = missing ^ repeating;

        return new int[]{repeating , missing};
    }
}
