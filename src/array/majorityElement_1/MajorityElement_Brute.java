package array.majorityElement_1;

public class MajorityElement_Brute {
    public static void main(String[] args) {
        int [] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int result = Majority(nums);
        System.out.println(result);

    }
    public static int Majority(int [] nums) {

        for(int i=0;i<nums.length;i++) {
            int count = 0;
            for(int j=0;j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return -1;
    }
}
