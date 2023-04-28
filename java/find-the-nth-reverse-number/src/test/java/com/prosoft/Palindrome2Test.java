package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Methods testing the Palindrome2 class")
class Palindrome2Test {
    @Test
    @DisplayName("findReverseNumber(1) => 0")
    void findReverseNumberExecutedSuccess() {
        assertEquals(BigInteger.valueOf(0), Palindrome2.findReverseNumber(1));
    }

    @Test
    @DisplayName("findReverseNumber(2) => 1")
    void findReverseNumberExecutedSuccess2() {
        assertEquals(BigInteger.valueOf(1), Palindrome2.findReverseNumber(2));
    }

    @Test
    @DisplayName("findReverseNumber(10) => 9")
    void findReverseNumberExecutedSuccess3() {
        assertEquals(BigInteger.valueOf(9), Palindrome2.findReverseNumber(10));
    }

    @Test
    @DisplayName("findReverseNumber(20) => 101")
    void findReverseNumberExecutedSuccess4() {
        assertEquals(BigInteger.valueOf(101), Palindrome2.findReverseNumber(20));
    }


}