package com.github.rosivaldolucas.easy.hackerrank;

public class JavaStringReverse {

  public static void main(String[] args) {
    String s = "madam";

    boolean isPalindrome = true;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println(isPalindrome ? "Yes" : "No");
  }

}
