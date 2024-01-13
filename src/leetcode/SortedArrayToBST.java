package leetcode;

public class SortedArrayToBST {

  public static void main(String[] args) {
    int[] nums = new int[] { 0, 1, 5, 12, 22, 41, 45, 53, 67 };
    TreeNode bst = sortedArrayToBST(nums);
    System.out.println(bst);
  }

  private static TreeNode sortedArrayToBST(int[] nums) {
    return createBST(nums, 0, nums.length - 1);
  }

  private static TreeNode createBST(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }
    int mid = left + (right - left) / 2;
    TreeNode root = new TreeNode(nums[mid]);
    root.left = createBST(nums, left, mid - 1);
    root.right = createBST(nums, mid + 1, right);
    return root;
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
