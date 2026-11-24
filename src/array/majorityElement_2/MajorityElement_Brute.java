package array.majorityElement_2;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_Brute {
    public static void main(String[] args) {

        int [] nums = {3,2,3};
        MajorityElement_Brute obj = new MajorityElement_Brute();
        List<Integer> result = obj.majorityElement(nums);
        System.out.println(result);
    }
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            if(list.contains(nums[i])) {
                continue;
            }
            int count = 0;
            for(int j=0;j< nums.length;j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 3) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
