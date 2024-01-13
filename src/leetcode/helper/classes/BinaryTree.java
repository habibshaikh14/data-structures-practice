package leetcode.helper.classes;

public class BinaryTree {
    private final int val;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int val) {
        this.val = val;
    }

    public BinaryTree(int val, BinaryTree left, BinaryTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
}
