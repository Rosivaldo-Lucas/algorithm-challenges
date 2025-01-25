package br.com.rosivaldolucas.algorithm.edae;

public class FindNumbersWithEvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int countNumbersPair = 0;
        for (int num : nums) {
            String[] aux = String.valueOf(num).split("");
            if (aux.length % 2 == 0) {
                countNumbersPair++;
            }
        }
        return countNumbersPair;
    }

}
