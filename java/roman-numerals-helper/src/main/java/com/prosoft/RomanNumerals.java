package com.prosoft;

/**
 * Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values will be
 * tested for each function.
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping
 * any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
 * 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 * Input range : 1 <= n < 4000
 * In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
 */
public class RomanNumerals {
    final static String[] ROMAN_NUM = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    final static int[] ARABIC_NUM = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        int remain = n, arabicNum;
        while (remain > 0) {
            arabicNum = -1;
            for (int i = 0; i < ARABIC_NUM.length; i++) {
                if ((remain >= ARABIC_NUM[i]) && (i < ARABIC_NUM.length - 1) && (remain < ARABIC_NUM[i + 1])) {
                    arabicNum = ARABIC_NUM[i];
                    result.append(ROMAN_NUM[i]);
                    break;
                }
            }
            if (arabicNum == -1) {
                arabicNum = ARABIC_NUM[ARABIC_NUM.length - 1];
                result.append(ROMAN_NUM[ARABIC_NUM.length - 1]);
            }
            remain = remain - arabicNum;
        }
        return result.toString();
    }

    public static int fromRoman(String romanNum) {
        int result = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            if ((romanNum.length() == 1) || (i == romanNum.length() - 1) || ((i + 1 < romanNum.length())
                    && (getArabic(romanNum.substring(i, i + 1)) >= getArabic(romanNum.substring(i + 1, i + 2))))) {
                result += getArabic(romanNum.substring(i, i + 1));
            }
            if ((i + 1 < romanNum.length()) && (getArabic(romanNum.substring(i, i + 1)) < getArabic(romanNum.substring(i + 1, i + 2)))) {
                result = result + getArabic(romanNum.substring(i + 1, i + 2)) - getArabic(romanNum.substring(i, i + 1));
                if (i + 1 < romanNum.length()) {
                    i++;
                }
            }
        }
        return result;
    }

    private static int getArabic(String romanNum) {
        int result = 0;
        for (int i = 0; i < ROMAN_NUM.length; i++) {
            if (ROMAN_NUM[i].equals(romanNum)) {
                result = ARABIC_NUM[i];
                break;
            }
        }
        return result;
    }
}
