package array.findRepeatingAndMissingNumber;

import java.util.Arrays;
import java.util.HashSet;

public class FIndMissingAndRepeating_Optimal {
    public static void main(String[] args) {

        int [] nums = {3, 5, 4, 1, 1};
        FIndMissingAndRepeating_Optimal obj = new FIndMissingAndRepeating_Optimal();
        int [] result = obj.findMissingRepeatingNumbers(nums);
        System.out.println(Arrays.toString(result));
    }
    public int[] findMissingRepeatingNumbers(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int [] freq = new int[2];
        for (int i=0;i<nums.length;i++) {
            if (set.contains(nums[i])) {
                freq[0] = nums[i];
            }
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++) {
            if (!set.contains(i)) {
                freq[1] = i;
            }
        }
        return freq;
    }
}
