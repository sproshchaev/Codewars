package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Kata class:")
class KataTest {

    @Test
    @DisplayName("2017 ==> 2071")
    void nextBiggerNumberExecutedSuccess() {
        assertEquals(2071, Kata.nextBiggerNumber(2017));
    }

    @Test
    @DisplayName("10990 ==> 19009")
    void nextBiggerNumberExecutedSuccess2() {
        assertEquals(19009, Kata.nextBiggerNumber(10990));
    }

    @Test
    @DisplayName("513 ==> 531")
    void nextBiggerNumberExecutedSuccess3() {
        assertEquals(531, Kata.nextBiggerNumber(513));
    }

    @Test
    @DisplayName("9 ==> -1")
    void nextBiggerNumberExecutedSuccess4() {
        assertEquals(-1, Kata.nextBiggerNumber(9));
    }

    @Test
    @DisplayName("12 ==> 21")
    void nextBiggerNumberExecutedSuccess5() {
        assertEquals(21, Kata.nextBiggerNumber(12));
    }

    @Test
    @DisplayName("144 ==> 414")
    void nextBiggerNumberExecutedSuccess6() {
        assertEquals(414, Kata.nextBiggerNumber(144));
    }

    @Test
    @DisplayName("111 ==> -1")
    void nextBiggerNumberExecutedSuccess7() {
        assertEquals(-1, Kata.nextBiggerNumber(111));
    }

    @Test
    @DisplayName("531 ==> -1")
    void nextBiggerNumberExecutedSuccess8() {
        assertEquals(-1, Kata.nextBiggerNumber(531));
    }

    @Test
    @DisplayName("1492878497 ==> 1492878749")
    void nextBiggerNumberExecutedSuccess9() {
        assertEquals(1492878749, Kata.nextBiggerNumber(1492878497));
    }

    @Test
    @DisplayName("59884848459853 ==> 59884848483559")
    void nextBiggerNumberExecutedSuccess10() {
        assertEquals(59884848483559L, Kata.nextBiggerNumber(59884848459853L));
    }

}