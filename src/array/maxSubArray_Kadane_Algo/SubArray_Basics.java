package array.maxSubArray_Kadane_Algo;

public class SubArray_Basics {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5};
        SubArray_Basics obj = new SubArray_Basics();
        obj.subArray(nums);
        System.out.print(nums);

    }

    public void subArray(int [] nums) {

        for(int i=0;i< nums.length;i++) {
            for(int j=i;j< nums.length;j++) {
                for(int k=i;k<=j;k++) {
                    System.out.print(nums[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
