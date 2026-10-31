    package array.removeDuplicatesFromSortedArray;

    public class RemoveDuplicates_Brute {
        public static void main(String[] args) {

            int [] nums = {5,5,7,8,8,9,9,10,10};
            int result = Remove(nums);

            for (int i=0;i<result;i++) {
                System.out.print (nums[i] + " ");
            }
        }
        public static int Remove(int [] nums) {

            int [] freq = new int[nums.length];

            int k = 0;
            for(int i=0;i< nums.length;i++) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    freq[k] = nums[i];
                    k++;
                }
            }
            for(int i =0;i<k;i++) {
                nums[i] = freq[i];
            }
            return k;
        }
    }
