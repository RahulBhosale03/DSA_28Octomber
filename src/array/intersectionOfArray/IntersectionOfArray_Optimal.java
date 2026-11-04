package array.intersectionOfArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArray_Optimal {
    public static void main(String[] args) {

        int [] nums1 = {1,1,1,2,2,3,3};
        int [] nums2 = {3,3,3,4};

        int [] res = IntersectionArray(nums1,nums2);

        System.out.println(Arrays.toString(res));

    }
    public static int[] IntersectionArray(int [] nums1 , int [] nums2) {
        int left = 0, right = 0;

        List<Integer> list = new ArrayList<>();

        while (left < nums1.length && right < nums2.length) {

            while (left>0 && left<nums1.length && nums1[left] == nums1[left - 1]) {
                left++;
            }
            while (right>0 && right<nums2.length && nums2[right] == nums2[right - 1]) {
                right++;
            }

            if (left >= nums1.length || right >= nums2.length) {
                break;
            }

            if (nums1[left] < nums2[right]) {
                left++;
            }else if (nums1[left] > nums2[right]) {
                right++;
            }else {
                list.add(nums1[left]);
                left++;
                right++;
            }
        }

        int [] result = new int[list.size()];
        for (int i=0;i<list.size();i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
