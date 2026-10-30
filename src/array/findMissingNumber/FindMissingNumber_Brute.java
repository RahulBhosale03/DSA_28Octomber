package array.findMissingNumber;

public class FindMissingNumber_Brute {
    public static void main(String[] args) {

//        int [] nums = {0,1,3};
        int [] nums = {0,1,3,2,4,5,6,8};
        int n = nums.length;

        for (int i=0;i<n;i++) {
            boolean isMissing = false;
            for(int j=0;j<n;j++) {
                if (nums[j] == i) {
                    isMissing = true;
                    break;
                }
            }
            if (!isMissing) {
                System.out.println(i);
               break;
            }
        }
    }
}
