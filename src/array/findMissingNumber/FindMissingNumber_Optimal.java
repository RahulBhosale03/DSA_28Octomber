package array.findMissingNumber;

public class FindMissingNumber_Optimal {
    public static void main(String[] args) {
        int [] nums = {0,1,2,4,5,6,7,8};

//        int [] nums = {1,2,4,5,6}; ------>
//        for this condition start interating from 1 to n + 1
//        becouse xorAll ^ i starts from 0 to n


        int result = FindMissing(nums);

        System.out.println(result);

    }
    public static int FindMissing(int [] nums) {

        int xorAll = 0;

        for (int i=0;i<=nums.length;i++) {
            xorAll = xorAll ^ i;
        }
        for (int num : nums ){
            xorAll = xorAll ^ num;
        }
        return xorAll;
    }
}
