package br.com.rosivaldolucas.algorithm.leetcode;

import java.util.Arrays;

public class OnePlus {

    public static void main(String[] args) {
        int[] digits = {9,9,9};

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result));
    }

    public static int[] plusOne(int[] digits) {
        boolean aumentarArray = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            int digit = digits[i];
            int sum = digit + 1;

            if (sum < 10) {
                digits[i] = sum;
                return digits;
            } else {
                digits[i] = 0;
            }

            if (i == 0) {
                aumentarArray = true;
                break;
            }
        }

        if (aumentarArray) {
            int[] newArray = new int[digits.length + 1];

            newArray[0] = 1;
            newArray[1] = 0;

            if (digits.length - 1 - 2 >= 0) System.arraycopy(digits, 2, newArray, 2, digits.length - 1 - 2);

            return newArray;
        }

        return digits;
    }
}
