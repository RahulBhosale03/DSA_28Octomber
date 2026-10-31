package array.removeDuplicatesFromSortedArray;


import java.util.Arrays;

public class RemoveDuplicates_Optimal {
    public static void main(String[] args) {

        int [] nums = {0,0,1,1,1,2,2,3,3,4};

        int result = Remove(nums);

        for (int i=0;i<result;i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int Remove(int [] nums) {
        int i = 0;
        for(int j=1;j<nums.length;j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
