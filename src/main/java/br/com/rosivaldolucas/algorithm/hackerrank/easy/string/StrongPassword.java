package br.com.rosivaldolucas.algorithm.hackerrank.easy.string;

public class StrongPassword {

    private static final String numbers = "0123456789";
    private static final String lower_case = "abcdefghijklmnopqrstuvwxyz";
    private static final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String special_characters = "!@#$%^&*()-+";

    public static void main(String[] args) {
        int result = minimumNumber(5, "2bb#A");

        System.out.println(result);
    }

    public static int minimumNumber(int tamPass, String password) {
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacters = false;

        for (char p : password.toCharArray()) {
            if (numbers.contains(p + "")) hasNumber = true;
            else if (lower_case.contains(p + "")) hasLowerCase = true;
            else if (upper_case.contains(p + "")) hasUpperCase = true;
            else if (special_characters.contains(p + "")) hasSpecialCharacters = true;
        }

        int missingTypes = 0;

        if (!hasNumber) missingTypes++;
        if (!hasLowerCase) missingTypes++;
        if (!hasUpperCase) missingTypes++;
        if (!hasSpecialCharacters) missingTypes++;

        return Math.max(missingTypes, 6 - tamPass);
    }

}
