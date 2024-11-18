package com.github.rosivaldolucas.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

  public static void main(String[] args) {

    System.out.println(isValid("()"));
    System.out.println(isValid("()[]{}"));
    System.out.println(isValid("(]"));
    System.out.println(isValid("[([]])"));

  }

  public static boolean isValid(String s) {
    List<Character> list = new ArrayList<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(' || c == '{' || c == '[') {
        list.add(c);
      } else if (c == ')' || c == '}' || c == ']') {
        if (list.isEmpty()) {
          return false;
        }

        Character lastCharacter = list.removeLast();

        if (
                (lastCharacter != '(' && c == ')') ||
                (lastCharacter != '{' && c == '}') ||
                (lastCharacter != '[' && c == ']')
        ) {
          return false;
        }
      }
    }

    return list.isEmpty();
  }

}
