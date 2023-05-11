package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Snail class:")
public class SnailTest {

    @Test
    @DisplayName("snail({{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}).length ==> 9")
    void snailLengthExecutedSuccess() {
        int[] expectedArray = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[][] inputArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(expectedArray.length, Snail.snail(inputArray).length);
    }

    @Test
    @DisplayName("snail({{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}) ==> [1,2,3,6,9,8,7,4,5]")
    void snailContentExecutedSuccess() {
        int[] expectedArray = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};
        int[][] inputArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(true, Arrays.equals(Snail.snail(inputArray), expectedArray));
    }

    @Test
    @DisplayName("snail({{1,2,3,3,3},{4,5,6,6,6},{7,8,9,9,9},{0,1,2,3,4},{5,6,7,8,9}}).length ==> 25")
    void snailLengthExecutedSuccess2() {
        int[] expectedArray = new int[]{1, 2, 3, 3, 3, 6, 9, 4, 9, 8, 7, 6, 5, 0, 7, 4, 5, 6, 6, 9, 3, 2, 1, 8, 9};
        int[][] inputArray = new int[][]{{1, 2, 3, 3, 3}, {4, 5, 6, 6, 6}, {7, 8, 9, 9, 9}, {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9}};
        assertEquals(expectedArray.length, Snail.snail(inputArray).length);
    }

    @Test
    @DisplayName("snail({{1,2,3,3,3},{4,5,6,6,6},{7,8,9,9,9},{0,1,2,3,4},{5,6,7,8,9}}) ==> " +
            "[1,2,3,3,3,6,9,4,9,8,7,6,5,0,7,4,5,6,6,9,3,2,1,8,9]")
    void snailContentExecutedSuccess2() {
        int[] expectedArray = new int[]{1, 2, 3, 3, 3, 6, 9, 4, 9, 8, 7, 6, 5, 0, 7, 4, 5, 6, 6, 9, 3, 2, 1, 8, 9};
        int[][] inputArray = new int[][]{{1, 2, 3, 3, 3}, {4, 5, 6, 6, 6}, {7, 8, 9, 9, 9}, {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9}};
        assertEquals(true, Arrays.equals(Snail.snail(inputArray), expectedArray));
    }

    @Test
    @DisplayName("snail({{1}}).length ==> 1")
    void snailLengthExecutedSuccess3() {
        int[] expectedArray = new int[]{1};
        int[][] inputArray = new int[][]{{1}};
        assertEquals(expectedArray.length, Snail.snail(inputArray).length);
    }

    @Test
    @DisplayName("snail({{1}}) ==> [1]")
    void snailContentExecutedSuccess3() {
        int[] expectedArray = new int[]{1};
        int[][] inputArray = new int[][]{{1}};
        assertEquals(true, Arrays.equals(Snail.snail(inputArray), expectedArray));
    }

}
