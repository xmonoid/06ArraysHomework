package com.tsystems.autotestuni.advanced;

public class ArraysAdvanced {

    /**
     * Implement a method which creates a three-dimensional array and fills its values with
     * the product of their indexes.
     *
     * @param n1 the 1st dimension
     * @param n2 the 2nd dimension
     * @param n3 the 3rd dimension
     * @return the 3-dim array
     */
    public static double[][][] threeDimensionalArray(int n1, int n2, int n3) {
        double[][][] result = new double[n1][n2][n3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                for (int k = 0; k < result[i][j].length; k++) {
                    result[i][j][k] = i * j * k;
                }
            }
        }

        return result;
    }

    /**
     * Implement a method which merges two {@code char} arrays the next way:
     * - even indexes take their values from the first array;
     * - odd indexes take their values from the second array.
     *
     * For example,
     * {1, 2, 3} + {-3, -2, -1}  =>  {1, -3, 2, -2, 3, -1}
     *
     * @param first the first array
     * @param second the second array
     * @return a merged array
     */
    public static short[] mergeTwoArrays(short[] first, short[] second) {
        short[] result = new short[first.length + second.length];

        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = first[i/2];
            } else {
                result[i] = second[i/2];
            }
        }

        return result;
    }
}
