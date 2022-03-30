package com.tsystems.autotestuni.advanced;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraysAdvancedTest {

    @Test
    void threeDimensionalArray() {
        assertArrayEquals(new double[0][0][0], ArraysAdvanced.threeDimensionalArray(0, 0, 0));
        var original = new double[][][] {{ {0,0,0}, {0,0,0} }};
        assertArrayEquals(original, ArraysAdvanced.threeDimensionalArray(1, 2, 3));
        original = new double[][][] {
                {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
                {{0, 0, 0}, {0, 1, 2}, {0, 2, 4}},
                {{0, 0, 0}, {0, 2, 4}, {0, 4, 8}}
        };
        assertArrayEquals(original, ArraysAdvanced.threeDimensionalArray(3, 3, 3));
    }

    @Test
    void mergeTwoArrays() {
        var first = new short[] {1};
        var second = new short[] {-1};
        var merged = new short[] {1, -1};
        assertArrayEquals(merged, ArraysAdvanced.mergeTwoArrays(first, second));
        first = new short[] {};
        second = new short[] {};
        merged = new short[] {};
        assertArrayEquals(merged, ArraysAdvanced.mergeTwoArrays(first, second));
        first = new short[] {-5, -6, -7, -8};
        second = new short[] {5, 6, 7, 8};
        merged = new short[] {-5, 5, -6, 6, -7, 7, -8, 8};
        assertArrayEquals(merged, ArraysAdvanced.mergeTwoArrays(first, second));
    }
}