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
    @DisplayName("nextSmaller(513) ==> 351")
    void nextSmallerExecutedSuccess2() {
        assertEquals(351, Kata.nextSmaller(513));
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

    @Test
    @DisplayName("nextSmaller(123456789) ==> -1")
    void nextSmallerExecutedSuccess11() {
        assertEquals(-1, Kata.nextSmaller(123456789));
    }

    @Test
    @DisplayName("nextSmaller(29009) ==> 20990")
    void nextSmallerExecutedSuccess12() {
        assertEquals(20990, Kata.nextSmaller(29009));
    }

    @Test
    @DisplayName("nextSmaller(1234567908) ==> 1234567890")
    void nextSmallerExecutedSuccess13() {
        assertEquals(1234567890, Kata.nextSmaller(1234567908));
    }

    @Test
    @DisplayName("nextSmaller(9999999999) ==> -1")
    void nextSmallerExecutedSuccess14() {
        assertEquals(-1, Kata.nextSmaller(9999999999L));
    }

    @Test
    @DisplayName("nextSmaller(59884848483559) ==> 59884848459853")
    void nextSmallerExecutedSuccess15() {
        assertEquals(59884848459853L, Kata.nextSmaller(59884848483559L));
    }

    @Test
    @DisplayName("nextSmaller(1023456789) ==> -1")
    void nextSmallerExecutedSuccess16() {
        assertEquals(-1, Kata.nextSmaller(1023456789));
    }

}
