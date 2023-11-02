/**
 * LeetCode
 * 
 * PALINDROME NUMBER
 * 
 * Give an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * Example 1:
 *  Input: x = 121
 *  Output: true
 *  Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 *  Input: x = -121
 *  Output: false
 *  Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 *  Input: x = 10
 *  Output: false
 *  Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 * @version 0.0.1 Novembro/02/2023
 * @author  LUCAS, Rosivaldo
 */

public class PalindromeNumber {

  public static boolean isPalindrome(final int x) {
    final String number = Integer.toString(x);

    final String[] separadetNumber = number.split("");

    String[] inverseNumber = new String[separadetNumber.length];

    for (int i = 1; i <= separadetNumber.length; i++) {
      inverseNumber[i - 1] = separadetNumber[separadetNumber.length - i];
    }

    if (number.equals(String.join("", inverseNumber))) {
      return true;
    }

    return false;
  }

  public static void main(final String[] args) {
    
    final int x = 121;     // is palindrome
    // final int x = -121;    // is not palindrome
    // final int x = 10;      // is not palindrome
    
    if (isPalindrome(x)) {
      System.out.println("Number " + x + " is palindrome.");
    } else {
      System.out.println("Number " + x + " is not palindrome.");
    }

  }

}
