package array.max_consecutive_once;

public class MaxConsecutiveOnce_brute {
    public static void main(String[] args) {

        int [] nums = {1,1,0,1,1,1};
        int result = ConsecutiveOnce(nums);
        System.out.println(result);

    }

    public static int ConsecutiveOnce(int [] nums) {

        int maxCount = 0;

        for (int i=0;i<nums.length;i++) {
            int count = 0;
            for (int j=i;j<nums.length;j++) {
                if (nums[j] == 1) {
                    count++;
                    maxCount = Math.max(maxCount,count);
                }else {
                    break;
                }
            }
        }
        return maxCount;
    }
}
