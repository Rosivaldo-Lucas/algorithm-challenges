package br.com.rosivaldolucas.algorithm.neetcode.medium;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = new int[] {7, 7};
        int k = 1;

        int[] result = topKFrequent(nums, k);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

}
