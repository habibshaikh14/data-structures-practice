package leetcode;

import leetcode.helper.classes.TreeNode;

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
    root.setLeft(createBST(nums, left, mid - 1));
    root.setRight(createBST(nums, mid + 1, right));
    return root;
  }

}