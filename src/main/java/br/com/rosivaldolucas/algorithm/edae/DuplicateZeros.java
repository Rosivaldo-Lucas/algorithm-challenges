package br.com.rosivaldolucas.algorithm.edae;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};

        int[] result = duplicateZeros_01(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] duplicateZeros_01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (j == i + 1) {
                        nums[j] = 0;
                    } else {
                        nums[j] = nums[j - 1];
                    }
                }
                i++;
            }
        }
        return nums;
    }

    public static int[] duplicateZeros_02(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                for (int j = nums.length - 2; j > i; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[i + 1] = nums[i];
                i++;
            }
        }
        return nums;
    }

}
