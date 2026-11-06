package array.leadersInArray;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 5, 3, 1, 2};
        LeadersInArray obj = new LeadersInArray();
        List<Integer> result = obj.leaders(nums);
        System.out.println(result);
    }
    public List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList();

        for(int i=0;i<nums.length;i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}
