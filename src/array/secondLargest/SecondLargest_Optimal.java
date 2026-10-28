package array.secondLargest;

public class SecondLargest_Optimal {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 5, 5, 4, 4, 5};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int result = secondLargest(nums,max1,max2);
        System.out.println(result);
    }

    public static int secondLargest(int [] nums , int max1 , int max2) {

       for (int i=0;i<nums.length;i++) {
           if (nums[i] > max1) {
               max2 = max1;
               max1 = nums[i];
           }else if (nums[i] > max2 && nums[i] < max1) {
               max2 = nums[i];
           }
       }
       if (max2 == Integer.MIN_VALUE) {
           return -1;
       }
       return max2;
    }
}
