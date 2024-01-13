package leetcode;

public class BalancedBinaryTree {

  public static void main(String[] args) {
    TreeNode bt = new TreeNode(0,
        new TreeNode(1),
        new TreeNode(2,
            new TreeNode(3, new TreeNode(4), null),
            null));
    System.out.println(isBalanced(bt));
  }

  private static boolean isBalanced(TreeNode root) {
    return getHeight(root) != -1;
  }

  private static int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int l = getHeight(root.left);
    int r = getHeight(root.right);
    // In case of left subtree or right subtree unbalanced, return -1...
    if (l == -1 || r == -1) {
      return -1;
    }
    // If their heights differ by more than ‘1’, return -1...
    if (Math.abs(l - r) > 1) {
      return -1;
    }
    // return max between l,r and add +1 for current node
    return Math.max(l, r) + 1;
  }
}

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
