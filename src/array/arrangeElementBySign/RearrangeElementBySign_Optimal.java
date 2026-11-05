package array.arrangeElementBySign;

import java.util.Arrays;

public class RearrangeElementBySign_Optimal {
    public static void main(String[] args) {

        int [] nums = {3,1,-2,-5,2,-4};
        RearrangeElementBySign_Optimal obj = new RearrangeElementBySign_Optimal();
        int [] result = obj.RearrangeArray(nums);
        System.out.println(Arrays.toString(result));

    }
    public int[] RearrangeArray(int[] nums) {

        int [] result = new int[nums.length];

        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int i=0;i< nums.length;i++) {
            if (nums[i] > 0) {
                result[positiveIndex] = nums[i];
                positiveIndex += 2;
            }else {
                result[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return result;
    }
}
