package leetcode;

import leetcode.helper.classes.TreeNode;

import static java.lang.System.out;

public class MaxTreeDepth {
    public static void main(String[] args) {
        var tree = new TreeNode(1, new TreeNode(2, new TreeNode(3), null),
                new TreeNode(5, null, new TreeNode(7, new TreeNode(8), null)));
        out.println("Max depth: " + maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Integer.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        } else {
            return 0;
        }
    }
}
