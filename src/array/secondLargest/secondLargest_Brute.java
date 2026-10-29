    package array.secondLargest;

    import java.util.Arrays;

    public class secondLargest_Brute {
        public static void main(String[] args) {
            int [] nums = {1,2,4,7,7,5};
            int res = secLargest(nums);
            System.out.println(res);
        }

        public static int secLargest(int [] nums) {

            Arrays.sort(nums);

            int largest = nums[nums.length - 1];
            int secLargest = Integer.MIN_VALUE;

            for (int i=nums.length-1;i>=0;i--) {
                if (nums[i] < largest) {
                    secLargest = nums[i];
                    break;
                }
            }
            if (secLargest == Integer.MIN_VALUE) {
                return -1;
            }
            return secLargest;
        }
    }
