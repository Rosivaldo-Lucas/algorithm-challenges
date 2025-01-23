package br.com.rosivaldolucas.algorithm.neetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};

        System.out.println(containsDuplicate_01(numbers));
        System.out.println(containsDuplicate_02(numbers));
    }

    public static boolean containsDuplicate_01(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate_02(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            set.add(nums[i]);
            if (set.contains(nums[i + 1])) {
                return true;
            }
        }
        return false;
    }

}
