package leetcode;

import leetcode.helper.classes.TreeNode;

import static java.lang.System.out;

public class IsSymmetric {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, new TreeNode(3), null),
                new TreeNode(2, null, new TreeNode(3)));
        out.println(isSymmetric(p));
    }

    private static boolean isSymmetric(TreeNode root) {
        return (root != null) && checkSymmetry(root.getLeft(), root.getRight());
    }

    private static boolean checkSymmetry(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return ((p.getVal() == q.getVal()) && (checkSymmetry(p.getLeft(), q.getRight()))
                    && (checkSymmetry(p.getRight(), q.getLeft())));
        } else {
            return (p == null && q == null);
        }
    }
}
