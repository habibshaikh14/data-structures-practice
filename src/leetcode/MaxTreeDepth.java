package leetcode;

import leetcode.helper.classes.BinaryTree;

import static java.lang.System.out;

public class MaxTreeDepth {
    public static void main(String[] args) {
        var tree = new BinaryTree(1, new BinaryTree(2, new BinaryTree(3), null),
                new BinaryTree(5, null, new BinaryTree(7, new BinaryTree(8), null)));
        out.println("Max depth: " + maxDepth(tree));
    }

    public static int maxDepth(BinaryTree root) {
        if (root != null) {
            return 1 + Integer.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
        } else {
            return 0;
        }
    }
}
