package br.com.rosivaldolucas.algorithm.leetcode;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int digit = -1;

        for (int i = 0; i < nums.length; i++) {
            if (digit != -1) {
                break;
            }

            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }

                if (nums[i] == nums[j]) {
                    digit = -1;
                    break;
                } else {
                    digit = nums[i];
                }
            }
        }

        return digit;
    }

}
