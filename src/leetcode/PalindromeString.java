package leetcode;

public class PalindromeString {

  public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String s) {
    s = s.trim();
    if (s.isEmpty()) {
      return true;
    }
    s = s.toLowerCase();
    int i = findLeftIndex(0, s);
    int j = findRightIndex(s.length() - 1, s);
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      } else {
        i = findLeftIndex(++i, s);
        j = findRightIndex(--j, s);
      }
    }
    return true;
  }

  private static int findLeftIndex(int i, String s) {
    char ch = s.charAt(i);
    while (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && i < s.length() - 1) {
      ch = s.charAt(++i);
    }
    return i;
  }

  private static int findRightIndex(int j, String s) {
    char ch = s.charAt(j);
    while (!(ch >= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'z') && j > 0) {
      ch = s.charAt(--j);
    }
    return j;
  }
}
