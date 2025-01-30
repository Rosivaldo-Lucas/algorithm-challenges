package br.com.rosivaldolucas.algorithm.edae.search_sort;

public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(binarySearch(nums, 1));
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int middle;
        int high = array.length - 1;

        while (low <= high) {
            middle = Math.floorDiv((low + high), 2);
            if (array[middle] > target) {
                // cut the right
                high = middle - 1;
            } else if (array[middle] < target) {
                // cut the left
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
