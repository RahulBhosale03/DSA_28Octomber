package array.sort_Array_of_0s_1s_2s;

import java.util.Arrays;

public class SortArray_0s_1s_2s_Brute {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        SortArray_0s_1s_2s_Brute obj = new SortArray_0s_1s_2s_Brute();
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=0;i< nums.length;i++) {
            if(nums[i] == 0) {
                count0++;
            }else if(nums[i] == 1) {
                count1++;
            }else {
                count2++;
            }
        }

        int index = 0;
        for(int i=0;i<count0;i++) {
            nums[index++] = 0;
        }
        for(int i=0;i<count1;i++) {
            nums[index++] = 1;
        }
        for(int i=0;i<count2;i++) {
            nums[index++] = 2;
        }
    }
}
