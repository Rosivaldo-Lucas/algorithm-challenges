package br.com.rosivaldolucas.algorithm.edae.search_sort;

public class SequentialSearch {

    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 20, 9, 99};

        System.out.println(sequencialSearch(nums, 20));
        System.out.println(sequencialSearch(nums, 100));
    }

    /**
     * Sequential Search <br />
     * searches for the element passed as a parameter in the array,
     * if the element is present, it returns its position,
     * otherwise, it returns -1, indicating that the element is not present in the array.
     *
     * @param array array
     * @param target element
     * @return returns the position of the element if it is present in the array, or - if it is not
     */
    public static int sequencialSearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
