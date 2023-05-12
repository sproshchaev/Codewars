package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Kata class:")
public class KataTest {

    @Test
    @DisplayName("nextSmaller(21) ==> 12")
    void nextSmallerExecutedSuccess() {
        assertEquals(12, Kata.nextSmaller(21));
    }

    @Test
    @DisplayName("nextSmaller(531) ==> 513")
    void nextSmallerExecutedSuccess2() {
        assertEquals(513, Kata.nextSmaller(531));
    }

    @Test
    @DisplayName("nextSmaller(2071) ==> 2017")
    void nextSmallerExecutedSuccess3() {
        assertEquals(2017, Kata.nextSmaller(2071));
    }

    @Test
    @DisplayName("nextSmaller(9) ==> -1")
    void nextSmallerExecutedSuccess4() {
        assertEquals(-1, Kata.nextSmaller(9));
    }

    @Test
    @DisplayName("nextSmaller(111) ==> -1")
    void nextSmallerExecutedSuccess5() {
        assertEquals(-1, Kata.nextSmaller(111));
    }

    @Test
    @DisplayName("nextSmaller(135) ==> -1")
    void nextSmallerExecutedSuccess6() {
        assertEquals(-1, Kata.nextSmaller(135));
    }

    @Test
    @DisplayName("nextSmaller(1027) ==> -1")
    void nextSmallerExecutedSuccess7() {
        assertEquals(-1, Kata.nextSmaller(1027));
    }

    @Test
    @DisplayName("nextSmaller(907) ==> 790")
    void nextSmallerExecutedSuccess8() {
        assertEquals(790, Kata.nextSmaller(907));
    }

    @Test
    @DisplayName("nextSmaller(441) ==> 414")
    void nextSmallerExecutedSuccess9() {
        assertEquals(414, Kata.nextSmaller(441));
    }

    @Test
    @DisplayName("nextSmaller(123456798) ==> 123456789")
    void nextSmallerExecutedSuccess10() {
        assertEquals(123456789, Kata.nextSmaller(123456798));
    }

}
