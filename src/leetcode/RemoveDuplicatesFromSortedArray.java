package leetcode;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        out.println(removeDuplicates(new int[] { 1, 1, 2, 2, 3, 3, 4 }));
    }

    private static String removeDuplicates(int[] sortedArray) {
        int i = 0;
        int j = sortedArray.length - 1;
        Set<Integer> cleanSet = new HashSet<>(sortedArray.length);
        while (i < j) {
            cleanSet.add(sortedArray[i]);
            cleanSet.add(sortedArray[j]);
            i++;
            j--;
        }
        cleanSet.add(sortedArray[i]);
        return cleanSet.toString();
    }
}
