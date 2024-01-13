package leetcode;

public class TelIntelSum {
  public static void main(String[] args) {
    String s = "Hello World Everyone";
    s = s.replaceAll("\\s", "");
    int c = (int) (Math.ceil(Math.sqrt(s.length() / 1.0)));
    char[] carr = s.toCharArray();
    StringBuilder x = new StringBuilder();
    for (int i = 0; i < c; i++) {
      for (int j = i; j < carr.length; j = j + c) {
        x.append(carr[j]);
      }
    }
    System.out.println(x.toString());
  }
}
