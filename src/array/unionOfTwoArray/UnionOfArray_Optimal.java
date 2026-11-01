package array.unionOfTwoArray;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionOfArray_Optimal {
    public static void main(String[] args) {

        int [] nums1 = {3, 4, 6, 7, 9, 9};
        int [] nums2 = {1, 5, 7, 8, 8};

        int [] res = UnionFind(nums1,nums2);
        System.out.println(Arrays.toString(res));

    }

    public static int [] UnionFind(int [] nums1, int [] nums2) {
        int left = 0;
        int right = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (left < nums1.length || right < nums2.length) {

            //Skip duplicates
            while (left>0 && left<nums1.length && nums1[left] == nums1[left - 1]) {
                left++;
            }
            while (right>0 && right<nums2.length && nums2[right] == nums2[right - 1]) {
                right++;
            }

            //if one array exhaust
            if (left >= nums1.length) {
                if (right < nums2.length) {
                    list.add(nums2[right]);
                    right++;
                }
                continue;
            }
            if (right >= nums2.length) {
                if (left < nums1.length) {
                    list.add(nums1[left]);
                    left++;
                }
                continue;
            }

            //Comparison between two arrays element
            if (nums1[left] < nums2[right]) {
                list.add(nums1[left]);
                left++;
            }else if (nums1[left] > nums2[right]) {
                list.add(nums2[right]);
                right++;
            }else {
                list.add(nums1[left]);
                right++;
                left++;
            }
        }
        int [] result = new int[list.size()];
        for (int i=0;i<list.size();i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
