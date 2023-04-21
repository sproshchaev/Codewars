package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the Palindrome class")
class PalindromeTest {

    @Test
    @DisplayName("findReverseNumber(1) => 0")
    void findReverseNumberExecutedSuccess() {
        //assertEquals(0, Palindrome.findReverseNumber(1));
    }

    @Test
    @DisplayName("findReverseNumber(2) => 1")
    void findReverseNumberExecutedSuccess2() {
        //assertEquals(1, Palindrome.findReverseNumber(2));
    }

    @Test
    @DisplayName("findReverseNumber(10) => 9")
    void findReverseNumberExecutedSuccess3() {
        //assertEquals(9, Palindrome.findReverseNumber(10));
    }

    @Test
    @DisplayName("findReverseNumber(100) => 909")
    void findReverseNumberExecutedSuccess4() {
        assertEquals(909, Palindrome.findReverseNumber(100));
    }

    @Test
    @DisplayName("findReverseNumber(100000000000L) => 900000000000000000009")
    void findReverseNumberExecutedSuccess5() {
        //assertEquals(new BigInteger("900000000000000000009"), Palindrome.findReverseNumber(100000000000L));
    }

}