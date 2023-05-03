package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Тестирование класса Palindrome2
 */
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
    @DisplayName("findReverseNumber(100) => 909")
    void findReverseNumberExecutedSuccess4() {
        assertEquals(BigInteger.valueOf(909), Palindrome2.findReverseNumber(100));
    }

    @Test
    @DisplayName("findReverseNumber(1000) => 9000000000009")
    void findReverseNumberExecutedSuccess5() {
        assertEquals(BigInteger.valueOf(9000000000009L), Palindrome2.findReverseNumber(1000));
    }

    @Test
    @DisplayName("findReverseNumber(100000000000L) => 900000000000000000009")
    void findReverseNumberExecutedSuccess6() {
        assertEquals(new BigInteger("900000000000000000009"), Palindrome2.findReverseNumber(100000000000L));
    }

}