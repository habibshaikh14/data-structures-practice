package leetcode;

import leetcode.helper.classes.ListNode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode("0 0 1");
        ListNode l2 = new ListNode("9 1");
        ListNode sum = addTwoNumbers(l1, l2);
        String sumString = new StringBuilder(sum.getString()).reverse().toString();
        System.out.println(sumString);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean hasCarry = false;
        ListNode result = new ListNode();
        ListNode last = result;
        ListNode head = result;

        while (l1 != null && l2 != null) {
            int sum = hasCarry ? 1 : 0;
            sum += l1.getVal() + l2.getVal();
            hasCarry = sum > 9;
            if (hasCarry) {
                sum -= 10;
            }
            result.setVal(sum);
            result.setNext(new ListNode());
            last = result;
            result = result.getNext();
            l1 = l1.getNext();
            l2 = l2.getNext();
        }

        if (l1 == null) {
            if (l2 != null) {
                result.setVal(l2.getVal());
                result.setNext(l2.getNext());
            } else if (!hasCarry) {
                last.setNext(null);
            }
        } else {
            result.setVal(l1.getVal());
            result.setNext(l1.getNext());
        }

        handleCarry(hasCarry, result, last);
        return head;
    }

    private static void handleCarry(boolean hasCarry, ListNode result, ListNode last) {
        if (hasCarry) {
            while (result != null && result.getVal() == 9) {
                result.setVal(0);
                last = result;
                result = result.getNext();
            }
            if (result == null) {
                last.setNext(new ListNode(1, null));
            } else {
                result.setVal(result.getVal() + 1);
            }
        }
    }
}
