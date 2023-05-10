package com.prosoft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods testing the RomanNumerals class:")
class RomanNumeralsTest {

    @Test
    @DisplayName("toRoman(2000) ==> 'MM'")
    void toRomanExecutedSuccess() {
        assertEquals("MM", RomanNumerals.toRoman(2000));
    }

    @Test
    @DisplayName("toRoman(1666) ==> 'MDCLXVI'")
    void toRomanExecutedSuccess2() {
        assertEquals("MDCLXVI", RomanNumerals.toRoman(1666));
    }

    @Test
    @DisplayName("toRoman(1000) ==> 'M'")
    void toRomanExecutedSuccess3() {
        assertEquals("M", RomanNumerals.toRoman(1000));
    }

    @Test
    @DisplayName("toRoman(400) ==> 'CD'")
    void toRomanExecutedSuccess4() {
        assertEquals("CD", RomanNumerals.toRoman(400));
    }

    @Test
    @DisplayName("toRoman(90) ==> 'XC'")
    void toRomanExecutedSuccess5() {
        assertEquals("XC", RomanNumerals.toRoman(90));
    }

    @Test
    @DisplayName("toRoman(40) ==> 'XL'")
    void toRomanExecutedSuccess6() {
        assertEquals("XL", RomanNumerals.toRoman(40));
    }

    @Test
    @DisplayName("toRoman(1) ==> 'I'")
    void toRomanExecutedSuccess7() {
        assertEquals("I", RomanNumerals.toRoman(1));
    }

    @Test
    @DisplayName("toRoman(2898) ==> 'MMDCCCXCVIII'")
    void toRomanExecutedSuccess8() {
        assertEquals("MMDCCCXCVIII", RomanNumerals.toRoman(2898));
    }

    @Test
    @DisplayName("fromRoman('MM') ==> 2000")
    void fromRomanExecutedSuccess() {
        assertEquals(2000, RomanNumerals.fromRoman("MM"));
    }

    @Test
    @DisplayName("fromRoman('MDCLXVI') ==> 1666")
    void fromRomanExecutedSuccess2() {
        assertEquals(1666, RomanNumerals.fromRoman("MDCLXVI"));
    }

    @Test
    @DisplayName("fromRoman('M') ==> 1000")
    void fromRomanExecutedSuccess3() {
        assertEquals(1000, RomanNumerals.fromRoman("M"));
    }

    @Test
    @DisplayName("fromRoman('CD') ==> 400")
    void fromRomanExecutedSuccess4() {
        assertEquals(400, RomanNumerals.fromRoman("CD"));
    }

    @Test
    @DisplayName("fromRoman('XC') ==> 90")
    void fromRomanExecutedSuccess5() {
        assertEquals(90, RomanNumerals.fromRoman("XC"));
    }

    @Test
    @DisplayName("fromRoman('XL') ==> 40")
    void fromRomanExecutedSuccess6() {
        assertEquals(40, RomanNumerals.fromRoman("XL"));
    }

    @Test
    @DisplayName("fromRoman('I') ==> 1")
    void fromRomanExecutedSuccess7() {
        assertEquals(1, RomanNumerals.fromRoman("I"));
    }

    @Test
    @DisplayName("fromRoman('DCCCXCVI') ==> 896")
    void fromRomanExecutedSuccess8() {
        assertEquals(896, RomanNumerals.fromRoman("DCCCXCVI"));
    }


}