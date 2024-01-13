package leetcode;

import leetcode.helper.classes.BinaryTree;

import static java.lang.System.out;

public class IsSymmetric {
    public static void main(String[] args) {
        BinaryTree p = new BinaryTree(1, new BinaryTree(2, new BinaryTree(3), null),
                new BinaryTree(2, null, new BinaryTree(3)));
        out.println(isSymmetric(p));
    }

    private static boolean isSymmetric(BinaryTree root) {
        return (root != null) && checkSymmetry(root.getLeft(), root.getRight());
    }

    private static boolean checkSymmetry(BinaryTree p, BinaryTree q) {
        if (p != null && q != null) {
            return ((p.getVal() == q.getVal()) && (checkSymmetry(p.getLeft(), q.getRight()))
                    && (checkSymmetry(p.getRight(), q.getLeft())));
        } else {
            return (p == null && q == null);
        }
    }
}
