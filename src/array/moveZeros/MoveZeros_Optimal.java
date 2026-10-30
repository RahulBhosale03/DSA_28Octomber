package array.moveZeros;

import java.util.Arrays;

public class MoveZeros_Optimal {
    public static void main(String[] args) {

        int [] nums = {1,0,2,0,3,0};
        MoveZero(nums);
        for (int num : nums) {
            System.out.print(num);
        }

    }
    public static void MoveZero(int [] nums) {
        int j = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
