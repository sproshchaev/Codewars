package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Snail class:")
public class SnailTest {

    @Test
    @DisplayName("snail({{1,2,3},{4,5,6},{7,8,9}}) ==> {1,2,3,6,9,8,7,4,5}")
    void toRomanExecutedSuccess() {
        assertEquals(new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, Snail.snail(new int[][] {{1, 2, 3, 3, 3}, {4, 5, 6, 6, 6}, {7, 8, 9, 9, 9},
                {0, 1, 2, 3, 4}, {5, 6, 7, 8, 9}}));
    }

}
