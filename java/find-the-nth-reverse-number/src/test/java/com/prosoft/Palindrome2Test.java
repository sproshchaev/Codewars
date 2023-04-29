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
    @DisplayName("findReverseNumber(11) => 11")
    void findReverseNumberExecutedSuccess4() {
        assertEquals(BigInteger.valueOf(11), Palindrome2.findReverseNumber(11));
    }

    @Test
    @DisplayName("findReverseNumber(19) => 99")
    void findReverseNumberExecutedSuccess5() {
        assertEquals(BigInteger.valueOf(99), Palindrome2.findReverseNumber(19));
    }

    @Test
    @DisplayName("findReverseNumber(20) => 101")
    void findReverseNumberExecutedSuccess6() {
        assertEquals(BigInteger.valueOf(101), Palindrome2.findReverseNumber(20));
    }

    @Test
    @DisplayName("findReverseNumber(30) => 202")
    void findReverseNumberExecutedSuccess7() {
        assertEquals(BigInteger.valueOf(202), Palindrome2.findReverseNumber(30));
    }

    @Test
    @DisplayName("findReverseNumber(100) => 909")
    void findReverseNumberExecutedSuccess8() {
        assertEquals(BigInteger.valueOf(909), Palindrome2.findReverseNumber(100));
    }

    @Test
    @DisplayName("findReverseNumber(110) => 1001")
    void findReverseNumberExecutedSuccess9() {
        assertEquals(BigInteger.valueOf(1001), Palindrome2.findReverseNumber(110));
    }

    @Test
    @DisplayName("findReverseNumber(120) => 2002")
    void findReverseNumberExecutedSuccess10() {
        assertEquals(BigInteger.valueOf(2002), Palindrome2.findReverseNumber(120));
    }

    @Test
    @DisplayName("findReverseNumber(130) => 3003")
    void findReverseNumberExecutedSuccess11() {
        assertEquals(BigInteger.valueOf(3003), Palindrome2.findReverseNumber(130));
    }

    @Test
    @DisplayName("findReverseNumber(190) => 9009")
    void findReverseNumberExecutedSuccess12() {
        assertEquals(BigInteger.valueOf(9009), Palindrome2.findReverseNumber(190));
    }

    @Test
    @DisplayName("findReverseNumber(199) => 9999")
    void findReverseNumberExecutedSuccess13() {
        assertEquals(BigInteger.valueOf(9999), Palindrome2.findReverseNumber(199));
    }

    @Test
    @DisplayName("findReverseNumber(200) => 10001")
    void findReverseNumberExecutedSuccess14() {
        assertEquals(BigInteger.valueOf(10001), Palindrome2.findReverseNumber(200));
    }

    @Test
    @DisplayName("findReverseNumber(100000000000L) => 900000000000000000009")
    void findReverseNumberExecutedSuccess15() {
        assertEquals(new BigInteger("900000000000000000009"), Palindrome2.findReverseNumber(100000000000L));
    }



}