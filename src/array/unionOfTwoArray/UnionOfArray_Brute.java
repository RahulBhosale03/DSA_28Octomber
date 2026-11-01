package array.unionOfTwoArray;

import java.util.*;

public class UnionOfArray_Brute {
    public static void main(String[] args) {

        int [] nums1 = {3, 4, 6, 7, 9, 9};
        int [] nums2 = {1, 5, 7, 8, 8};

        Set<Integer> set = new TreeSet<>();

        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set.add(num);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
//        Collections.sort(list);
        System.out.print(list);
    }
}
