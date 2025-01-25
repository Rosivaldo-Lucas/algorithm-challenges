package br.com.rosivaldolucas.algorithm.edae;

public class DotProductOfTwoSparseVectors {

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 2, 3};
        int[] b = {0, 3, 0, 4, 0};

        System.out.println(dotProduct(a, b));
    }

    public static double dotProduct(int[] a, int[] b) {
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }

}
