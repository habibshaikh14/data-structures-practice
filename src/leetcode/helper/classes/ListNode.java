package leetcode.helper.classes;

import java.util.Arrays;
import java.util.LinkedList;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        setVal(val);
    }

    public ListNode(int val, ListNode next) {
        setVal(val);
        setNext(next);
    }

    public ListNode(String valueString) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(valueString.split(" ")).stream().map(Integer::parseInt).toList());
        if (!linkedList.isEmpty()) {
            setVal(linkedList.pollFirst());
            setNext(new ListNode(linkedList));
        }
    }

    private ListNode(LinkedList<Integer> values) {
        if (values.size() > 1) {
            setVal(values.pollFirst());
            setNext(new ListNode(values));
        } else if (!values.isEmpty()) {
            setVal(values.pollFirst());
            setNext(null);
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public String getString() {
        StringBuilder listString = new StringBuilder(String.valueOf(val));
        ListNode head = next;
        while (head != null) {
            listString.append("->" + head.val);
            head = head.next;
        }
        return listString.toString();
    }
}
