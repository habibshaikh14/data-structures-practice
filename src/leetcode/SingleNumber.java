package leetcode;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 1, 3, 5, 3, 1 }));
    }

    private static int singleNumber(int[] numbers) {
        System.out.println(solution1(numbers));
        return optimalSolution(numbers);
    }

    private static int optimalSolution(int[] numbers) {
        int num = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            num ^= numbers[i];
        }
        return num;
    }

    private static int solution1(int[] numbers) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i : numbers) {
            if (!numSet.remove(i)) {
                numSet.add(i);
            }
        }
        return numSet.iterator().next();
    }
}
