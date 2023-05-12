package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Kata class:")
public class KataTest {

    @Test
    @DisplayName(" ==> ")
    void nextSmallerExecutedSuccess() {
        assertEquals(0L, Kata.nextSmaller(0L));
    }

}
