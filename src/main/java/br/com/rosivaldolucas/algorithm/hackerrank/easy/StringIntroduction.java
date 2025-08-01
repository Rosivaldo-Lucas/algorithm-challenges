package br.com.rosivaldolucas.algorithm.hackerrank.easy;

import java.util.Scanner;

public class StringIntroduction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String B = scan.nextLine();

        scan.close();

        int totalLength = A.length() + B.length();
        boolean isAGreater = A.compareTo(B) > 0;
        String result = isAGreater ? "yes" : "no";

        String captalizedA = captalize(A);
        String captalizedB = captalize(B);

        System.out.println(totalLength);
        System.out.println(result);
        System.out.println(captalizedA + " " + captalizedB);
    }

    private static String captalize(String value) {
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }

}
