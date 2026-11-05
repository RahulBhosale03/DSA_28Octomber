package array.arrangeElementBySign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeElementBySign_Brute {
    public static void main(String[] args) {
        int [] nums = {3,1,-2,-5,2,-4};

        RearrangeElementBySign_Brute obj = new RearrangeElementBySign_Brute();

        int [] result = obj.RearrangeArray(nums);

        System.out.println(Arrays.toString(result));
    }
    public int[] RearrangeArray(int[] nums) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i=0;i< nums.length;i++) {

            if (nums[i] > 0) {
                positive.add(nums[i]);
            }else {
                negative.add(nums[i]);
            }
        }

        int [] ans = new int[nums.length];

        for (int i=0;i<positive.size();i++) {

            ans[2 * i] = positive.get(i);
            ans[2 * i + 1] = negative.get(i);
        }
        return ans;
    }
}
