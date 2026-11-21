package array.nextPermutation;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {

        int [] nums = {1,2,3,6,5,4};
        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }
    public void nextPermutation(int[] nums) {

        int pivot = -1;
        int n = nums.length;

        for(int i = n-2;i>0;i--) {
            if (nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            int left = 0;
            int right = n-1;

            while (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }

        for (int i=n-1;i>pivot;i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        int left = pivot+1;
        int right = n-1;

        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
