package leetcode;

// https://leetcode.com/problems/top-k-frequent-elements/description/
public class ProductExceptSelf {
  public static void main(String[] args) {
    productExceptSelf(new int[] { 1, 2, 3, 4 });
  }

  public static int[] productExceptSelf(int[] nums) {
    int size = nums.length;
    int[] result = new int[size];
    int preProduct = 1;
    for (int i = 0; i < size; i++) {
      result[i] = preProduct;
      preProduct *= nums[i];
    }
    int postProduct = 1;
    for (int i = size - 1; i >= 0; i--) {
      result[i] *= postProduct;
      postProduct *= nums[i];
    }
    return result;
  }
}
