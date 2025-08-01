package br.com.rosivaldolucas.algorithm.hackerrank.easy.string;

public class CamelCase {

    private static final String uppercaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        String input = "saveChangesInTheEditorMore";

        int result = camelCaseV2(input);

        System.out.println("Result is: " + result);
    }

    public static int camelCase(String input) {
        char[] inputArray = input.toCharArray();

        StringBuilder result = new StringBuilder();

        for (char letter : inputArray) {
            if (uppercaseAlphabet.contains(letter + "")) {
                result.append(",");
            }
            result.append(letter);
        }

        String[] resultArray = result.toString().split(",");

        return resultArray.length;
    }

    public static int camelCaseV2(String input) {
        char[] inputArray = input.toCharArray();
        int count = 1;

        for (char letter : inputArray) {
            if (letter >= 'A' && letter <= 'Z') {
                count++;
            }
        }

        return count;
    }

}
