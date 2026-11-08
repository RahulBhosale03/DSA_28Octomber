package array.sort_Array_of_0s_1s_2s;

import java.util.Arrays;

public class SortArray_0s_1s_2s_Optimal {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        SortArray_0s_1s_2s_Brute obj = new SortArray_0s_1s_2s_Brute();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public void sortColors(int[] nums) {

        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (low <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if (mid == 1) {
                mid++;
            }else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
