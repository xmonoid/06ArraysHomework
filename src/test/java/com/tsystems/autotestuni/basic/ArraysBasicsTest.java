package com.tsystems.autotestuni.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysBasicsTest {

    @Test
    void createArray() {
        assertThrows(NegativeArraySizeException.class, () -> ArraysBasics.createArray(-1));
        assertArrayEquals(new int[0], ArraysBasics.createArray(0));
        assertArrayEquals(new int[] {-1, 1, 3, 5, 7}, ArraysBasics.createArray(5));
    }

    @Test
    void copyArray() {
        var original = new float[0];
        assertNotEquals(original, ArraysBasics.copyArray(original));
        assertArrayEquals(original, ArraysBasics.copyArray(original));
        original = new float[] {-2.3f, 0.0f, Float.NaN, -7.f, Float.NEGATIVE_INFINITY};
        assertNotEquals(original, ArraysBasics.copyArray(original));
        assertArrayEquals(original, ArraysBasics.copyArray(original));
    }

    @Test
    void arraysEqual() {
        var original = new char[0];
        assertTrue(ArraysBasics.arraysEqual(original, original));
        assertTrue(ArraysBasics.arraysEqual(original, new char[0]));
        original = new char[] {'T', 'h', 'i', 's', 'i', 's', 'a', 'n', 'a', 'r', 'r', 'a', 'y'};
        var newArray = new char[original.length];
        System.arraycopy(original, 0, newArray, 0, original.length);
        assertTrue(ArraysBasics.arraysEqual(original, newArray));
        var diffLength = new char[] {'T', 'h', 'i', 's', 'i', 's', 'a', 'n', 'a', 'r', 'r', 'a'};
        assertFalse(ArraysBasics.arraysEqual(original, diffLength));
        var diffValues = new char[] {'T', 'h', 'i', 's', 'i', 's', 'a', 'n', 'a', 'r', 'r', 'a', 'q'};
        assertFalse(ArraysBasics.arraysEqual(original, diffValues));
    }
}