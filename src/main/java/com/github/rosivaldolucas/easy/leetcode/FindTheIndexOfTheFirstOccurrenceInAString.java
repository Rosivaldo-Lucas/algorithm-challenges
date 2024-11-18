package com.github.rosivaldolucas.easy.leetcode;

public class FindTheIndexOfTheFirstOccurrenceInAString {

  public static void main(String[] args) {
    String hatstack = "leetcode";
    String needle = "eet";

    System.out.println(strStr(hatstack, needle));

  }

  public static int strStr(String haystack, String needle) {
    int index = 0;
    int cont = 0;

    for (int i = 0; i < haystack.length(); i++) {
      if (cont < needle.length()) {
        cont = 0;

        for (int j = 0; j < needle.length(); j++) {
          if (i + j < haystack.length() && haystack.charAt(i + j) == needle.charAt(j)) {
            index = i;
            cont++;
          } else {
            index = -1;
            break;
          }
        }
      } else {
        break;
      }
    }

    return index;
  }

}
