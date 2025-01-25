package br.com.rosivaldolucas.algorithm.neetcode.easy;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 7;

        int[] result = twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }

}
