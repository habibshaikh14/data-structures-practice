package leetcode;

import leetcode.helper.classes.TreeNode;

import static java.lang.System.out;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4));
        TreeNode q = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), new TreeNode(4));
        out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.getVal() == q.getVal() && isSameTree(p.getLeft(), q.getLeft())
                    && isSameTree(p.getRight(), q.getRight());
        } else {
            return (p == null && q == null);
        }
    }
}
