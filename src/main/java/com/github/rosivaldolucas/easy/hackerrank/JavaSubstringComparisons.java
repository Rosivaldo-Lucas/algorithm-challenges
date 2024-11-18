package com.github.rosivaldolucas.easy.hackerrank;

public class JavaSubstringComparisons {

  public static String getSmallestAndLargest(String s, int k) {
    String formattedString = s.replace("[^a-zA-Z]", "");

    String[] substrings = new String[formattedString.length() - k + 1];

    for (int i = 0; i < formattedString.length(); i++) {
      if (k <= formattedString.length()) {
        substrings[i] = formattedString.substring(i, k++);
      } else {
        break;
      }
    }

    for (int i = 0; i < substrings.length; i++) {
      for (int j = i + 1; j < substrings.length; j++) {
        if (substrings[i].compareTo(substrings[j]) > 0) {
          String temp = substrings[i];
          substrings[i] = substrings[j];
          substrings[j] = temp;
        }
      }
    }

    String smallest = substrings[0];
    String largest = substrings[substrings.length - 1];

    return smallest + "\n" + largest;
  }

  public static void main(String[] args) {
    String s = "welcometojava";
    int k = 3;

    System.out.println(getSmallestAndLargest(s, k));
  }

}
