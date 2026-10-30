package array.moveZeros;

public class MoveZeros_Brute {
    public static void main(String[] args) {

        int [] nums = {1,0,2,0,3,0};

        int [] freq = new int[nums.length];
        int index = 0;

        for (int i=0;i< nums.length;i++) {
            if (nums[i] != 0) {
                freq[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            freq[index++] = 0;
        }

        for (int num : freq) {
            System.out.print(num+" ");
        }
    }
}
