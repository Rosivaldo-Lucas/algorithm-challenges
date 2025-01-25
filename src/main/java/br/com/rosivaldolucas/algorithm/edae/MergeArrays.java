package br.com.rosivaldolucas.algorithm.edae;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int[] result = merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] a, int m, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            a[m + i] = b[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
            }
        }

        return a;
    }

}
