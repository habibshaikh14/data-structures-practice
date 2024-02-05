package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

public class ReversePolishNotation {
  public static void main(String[] args) {
    System.out.println(evalRPN(new String[] { "4", "13", "5", "/", "+" }));
  }

  private static int evalRPN(String[] tokens) {
    Deque<Integer> numbers = new ArrayDeque<>();
    for (String token : tokens) {
      switch (token) {
        case "+":
          numbers.offerFirst(numbers.pollFirst() + numbers.pollFirst());
          break;
        case "-":
          int sub = numbers.pollFirst();
          numbers.offerFirst(numbers.pollFirst() - sub);
          break;
        case "*":
          numbers.offerFirst(numbers.pollFirst() * numbers.pollFirst());
          break;
        case "/":
          int div = numbers.pollFirst();
          numbers.offerFirst(numbers.pollFirst() / div);
          break;
        default:
          numbers.offerFirst(Integer.parseInt(token));
      }
    }
    return numbers.pollFirst();
  }
}
