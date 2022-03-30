package com.tsystems.autotestuni.basic;

public class ArraysBasics {

    /**
     * Implement a method which creates an array of {@code int} with a capacity of {@code length} values.
     * Fill the values with the rule {@code 2 * i - 1}, where {@code i} is the index of an element.
     *
     * @param length the capacity of a new array
     * @return array in {@code int}
     */
    public static int[] createArray(int length) {
        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = 2 * i - 1;
        }
        return a;
    }

    /**
     * Implement a method which creates a copy of an existing array.
     *
     * @param original an original array should be copied
     * @return a new array with the same length and values
     */
    public static float[] copyArray(float[] original) {
        float[] newArray = new float[original.length];

        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    /**
     * Implement a method which checks two arrays for equality.
     *
     * Arrays are equal if and only if they have the same length, the same values of their elements
     * in the same order.
     *
     * @param first the first array
     * @param second the second array
     * @return {@code true} if arrays are equal, {@code false} otherwise
     */
    public static boolean arraysEqual(char[] first, char[] second) {
        if (first.length != second.length) {
            return false;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return false;
            }
        }

        return true;
    }
}
