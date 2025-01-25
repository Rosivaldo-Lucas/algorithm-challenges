package br.com.rosivaldolucas.algorithm.edae;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0};

        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            } else {
                if (countOnes > maxOnes) {
                    maxOnes = countOnes;
                }
                countOnes = 0;
            }
        }

        return Math.max(countOnes, maxOnes);
    }

}
