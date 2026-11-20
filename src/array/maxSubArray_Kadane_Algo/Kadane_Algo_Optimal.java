package array.maxSubArray_Kadane_Algo;

public class Kadane_Algo_Optimal {
    public static void main(String[] args) {

        int [] nums = {2, 3, 5, -2, 7, -4};
        Kadane_Algo_Optimal obj = new Kadane_Algo_Optimal();
        int result = obj.maxSubArray(nums);
        System.out.println(result);
    }
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i< nums.length;i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum,currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}
