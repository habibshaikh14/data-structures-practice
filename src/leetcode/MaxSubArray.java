package leetcode;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * Kadane's Algorithm. Initialize: max_so_far = 0 max_ending_here = 0
 * <p>
 * Loop for each element of the array "a"
 * (a) max_ending_here = max_ending_here + a[i]
 * (b) if(max_so_far < max_ending_here) max_so_far = max_ending_here
 * (c) if(max_ending_here < 0) max_ending_here = 0 return max_so_far
 */

public class MaxSubArray {
    public static void main(String[] args) {
        for (int[] ints : Arrays.asList(new int[] { 2, 3, 4, -1, -6, 9 }, new int[] { 2, 3, 9, -1, -6, 9 },
                new int[] { 2, -1, 4, -1, -6, 9 })) {
            out.println(maxSubArray(ints));
        }
    }

    public static int maxSubArray(int[] numbers) {
        int max = numbers[0];
        int currMax = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currMax = Math.max(numbers[i], currMax + numbers[i]);
            max = Math.max(max, currMax);
        }
        return max;
    }
}
