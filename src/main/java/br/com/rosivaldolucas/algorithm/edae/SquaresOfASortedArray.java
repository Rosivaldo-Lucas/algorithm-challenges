package br.com.rosivaldolucas.algorithm.edae;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = squaresOfSortedArray(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] squaresOfSortedArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}
