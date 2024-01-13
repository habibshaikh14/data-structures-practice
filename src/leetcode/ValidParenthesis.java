package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import static java.lang.System.out;

public class ValidParenthesis {
    public static void main(String[] args) {
        for (String s : Arrays.asList("(()[][]{})", "(({{[[]]}}))", "{}()({}", "((((", "]]]]")) {
            out.println(isValid(s));
        }
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '}', ']', ')':
                    if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
            i++;
        }
        return s.length() > 0 && stack.isEmpty() && i == s.length();
    }
}
