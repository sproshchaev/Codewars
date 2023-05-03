package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Класс содержит тесты для Palindrome4
 */
@DisplayName("Methods testing the Palindrome4 class")
class Palindrome4Test {

    @Test
    @DisplayName("findReverseNumber(1) => 0")
    void findReverseNumberExecutedSuccess() {
        assertEquals(BigInteger.valueOf(0), Palindrome4.findReverseNumber(1));
    }

    @Test
    @DisplayName("findReverseNumber(2) => 1")
    void findReverseNumberExecutedSuccess2() {
        assertEquals(BigInteger.valueOf(1), Palindrome4.findReverseNumber(2));
    }

    @Test
    @DisplayName("findReverseNumber(10) => 9")
    void findReverseNumberExecutedSuccess3() {
        assertEquals(BigInteger.valueOf(9), Palindrome4.findReverseNumber(10));
    }

    @Test
    @DisplayName("findReverseNumber(11) => 11")
    void findReverseNumberExecutedSuccess4() {
        assertEquals(BigInteger.valueOf(11), Palindrome4.findReverseNumber(11));
    }

    @Test
    @DisplayName("findReverseNumber(19) => 99")
    void findReverseNumberExecutedSuccess5() {
        assertEquals(BigInteger.valueOf(99), Palindrome4.findReverseNumber(19));
    }

    @Test
    @DisplayName("findReverseNumber(20) => 101")
    void findReverseNumberExecutedSuccess6() {
        assertEquals(BigInteger.valueOf(101), Palindrome4.findReverseNumber(20));
    }

    @Test
    @DisplayName("findReverseNumber(30) => 202")
    void findReverseNumberExecutedSuccess7() {
        assertEquals(BigInteger.valueOf(202), Palindrome4.findReverseNumber(30));
    }

    @Test
    @DisplayName("findReverseNumber(100) => 909")
    void findReverseNumberExecutedSuccess8() {
        assertEquals(BigInteger.valueOf(909), Palindrome4.findReverseNumber(100));
    }

    @Test
    @DisplayName("findReverseNumber(110) => 1001")
    void findReverseNumberExecutedSuccess9() {
        assertEquals(BigInteger.valueOf(1001), Palindrome4.findReverseNumber(110));
    }

    @Test
    @DisplayName("findReverseNumber(120) => 2002")
    void findReverseNumberExecutedSuccess10() {
        assertEquals(BigInteger.valueOf(2002), Palindrome4.findReverseNumber(120));
    }

    @Test
    @DisplayName("findReverseNumber(130) => 3003")
    void findReverseNumberExecutedSuccess11() {
        assertEquals(BigInteger.valueOf(3003), Palindrome4.findReverseNumber(130));
    }

    @Test
    @DisplayName("findReverseNumber(190) => 9009")
    void findReverseNumberExecutedSuccess12() {
        assertEquals(BigInteger.valueOf(9009), Palindrome4.findReverseNumber(190));
    }

    @Test
    @DisplayName("findReverseNumber(199) => 9999")
    void findReverseNumberExecutedSuccess13() {
        assertEquals(BigInteger.valueOf(9999), Palindrome4.findReverseNumber(199));
    }

    @Test
    @DisplayName("findReverseNumber(200) => 10001")
    void findReverseNumberExecutedSuccess14() {
        assertEquals(BigInteger.valueOf(10001), Palindrome4.findReverseNumber(200));
    }

    @Test
    @DisplayName("findReverseNumber(300) => 20002")
    void findReverseNumberExecutedSuccess15() {
        assertEquals(BigInteger.valueOf(20002), Palindrome4.findReverseNumber(300));
    }

    @Test
    @DisplayName("findReverseNumber(321) => 22122")
    void findReverseNumberExecutedSuccess15_1() {
        assertEquals(BigInteger.valueOf(22122), Palindrome4.findReverseNumber(321));
    }

    @Test
    @DisplayName("findReverseNumber(31680178650) => 216801786505687108612")
    void findReverseNumberExecutedSuccess16_Attempt() {
        assertEquals(new BigInteger("216801786505687108612"), Palindrome4.findReverseNumber(31680178650L));
    }

    @Test
    @DisplayName("findReverseNumber(87824081010) => 778240810101018042877")
    void findReverseNumberExecutedSuccess17_Attempt() {
        assertEquals(new BigInteger("778240810101018042877"), Palindrome4.findReverseNumber(87824081010L));
    }

    @Test
    @DisplayName("findReverseNumber(39467644060) => 294676440606044676492")
    void findReverseNumberExecutedSuccess18_Attempt() {
        assertEquals(new BigInteger("294676440606044676492"), Palindrome4.findReverseNumber(39467644060L));
    }

    @Test
    @DisplayName("findReverseNumber(100000000000L) => 900000000000000000009")
    void findReverseNumberExecutedSuccessMax() {
        assertEquals(new BigInteger("900000000000000000009"), Palindrome4.findReverseNumber(100000000000L));
    }

}