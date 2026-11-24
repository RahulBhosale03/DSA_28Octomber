package array.majorityElement_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement_optimal {
    public static void main(String[] args) {

        int [] nums = {3,2,3};
        MajorityElement_optimal obj = new MajorityElement_optimal();
        List<Integer> result = obj.majorityElement(nums);
        System.out.println(result);
    }
    public List<Integer> majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< nums.length;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            }else {
                map.put(nums[i],1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int x : map.keySet()) {
            if (map.get(x) > nums.length / 3) {
                list.add(x);
            }
        }
        return list;
    }
}
