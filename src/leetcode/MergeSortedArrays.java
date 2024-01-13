package leetcode;

import static java.lang.System.out;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        merge(nums1, 3, nums2, nums2.length);
        for (int num : nums1) {
            out.println(num);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                shiftToRight(nums1, m, i);
                nums1[i] = nums2[j];
                m++;
                j++;
            }
            i++;
        }
        if (i == m) {
            while (j < n) {
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }
    }

    public static void shiftToRight(int[] nums1, int end, int pos) {
        while (pos < end) {
            nums1[end] = nums1[end - 1];
            end--;
        }
    }
}
