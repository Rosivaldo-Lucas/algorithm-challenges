package com.github.rosivaldolucas.easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RomanToInteger {

  public static void main(String[] args) {

    System.out.println(romanToInt("MCMXCIV"));
    System.out.println(romanToInt("LVIII"));
    System.out.println(romanToInt("III"));

  }

  public static int romanToInt(String s) {
    List<String> list = getPairRomanNumbers(s);

    int value = 0;

    for (String l : list) {
      value = switch (l) {
        case "I"  ->  value + 1;
        case "IV" ->  value + 4;
        case "V"  ->  value + 5;
        case "IX" ->  value + 9;
        case "X"  ->  value + 10;
        case "XL" ->  value + 40;
        case "L"  ->  value + 50;
        case "XC" ->  value + 90;
        case "C"  ->  value + 100;
        case "CD" ->  value + 400;
        case "D"  ->  value + 500;
        case "CM" ->  value + 900;
        case "M"  ->  value + 1000;
        default -> throw new IllegalStateException("Unexpected value: " + l);
      };
    }

    return value;
  }

  private static List<String> getPairRomanNumbers(String s) {
    List<String> list = new ArrayList<>();

    int lastIndex = s.length() - 1;

    for (int i = 0; i < s.length(); i++) {
      boolean aux = i < lastIndex;

      char currentChar = s.charAt(i);
      char nextChar = aux ? s.charAt(i + 1) : 0;

      boolean condition1 = aux && currentChar == 'I' && (nextChar == 'V' || nextChar == 'X');
      boolean condition2 = aux && currentChar == 'X' && (nextChar == 'L' || nextChar == 'C');
      boolean condition3 = aux && currentChar == 'C' && (nextChar == 'D' || nextChar == 'M');

      if (condition1 || condition2 || condition3) {
        list.add("" + currentChar + nextChar);
        i++;
      } else {
        list.add(String.valueOf(currentChar));
      }
    }
    return list;
  }

}
