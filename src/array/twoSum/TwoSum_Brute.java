package array.twoSum;
import java.util.Arrays;

public class TwoSum_Brute {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        TwoSum_Brute obj = new TwoSum_Brute();
        int [] result = obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            return new int[0];
        }
        for(int i=0;i< nums.length;i++) {
            for(int j=i+1;j< nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
