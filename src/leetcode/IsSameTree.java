package leetcode;

import leetcode.helper.classes.BinaryTree;

import static java.lang.System.out;

public class IsSameTree {
    public static void main(String[] args) {
        BinaryTree p = new BinaryTree(1, new BinaryTree(2, new BinaryTree(3), null), new BinaryTree(4));
        BinaryTree q = new BinaryTree(1, new BinaryTree(2, new BinaryTree(3), null), new BinaryTree(4));
        out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(BinaryTree p, BinaryTree q) {
        if (p != null && q != null) {
            return p.getVal() == q.getVal() && isSameTree(p.getLeft(), q.getLeft())
                    && isSameTree(p.getRight(), q.getRight());
        } else {
            return (p == null && q == null);
        }
    }
}
