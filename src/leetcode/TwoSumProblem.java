package leetcode;

import static java.lang.System.out;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] numbers = { 3, 2, 4 };
        int target = 6;
        int[] result = twoSum(numbers, target);
        out.println("Result is: [" + result[0] + ", " + result[1] + "]");
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] solution = { 0, 0 };
        boolean hasSolution = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    hasSolution = true;
                    break;
                }
            }
            if (hasSolution) {
                break;
            }
        }
        return solution;
    }
}
