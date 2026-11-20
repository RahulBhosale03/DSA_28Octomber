package array.maxSubArray_Kadane_Algo;

public class Kadane_Algo_Brute {
    public static void main(String[] args) {

        int [] nums = {2, 3, 5, -2, 7, -4};
        Kadane_Algo_Brute obj = new Kadane_Algo_Brute();
        int result = obj.maxSubArray(nums);
        System.out.println(result);
    }
    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
                int arrSum = 0;
            for (int j=i;j<nums.length;j++) {
                arrSum += nums[j];
                maxSum = Math.max(maxSum,arrSum);
            }
        }
        return maxSum;
    }
}
