package com.prosoft;

public class RomanNumerals {
    final static char[] ROMAN_NUM_ARR = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    final static int[] ARABIC_NUM_ARR = new int[]{1, 5, 10, 50, 100, 500, 1000};

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        int remain = n, arabicNum;
        while (remain > 0) {

            arabicNum = -1;
            for (int i = 0; i < ARABIC_NUM_ARR.length; i++) {
                if ((remain >= ARABIC_NUM_ARR[i]) && (i < ARABIC_NUM_ARR.length - 1) && (remain < ARABIC_NUM_ARR[i + 1])) {
                    arabicNum = ARABIC_NUM_ARR[i];
                    result.append(ROMAN_NUM_ARR[i]);
                    break;
                }
            }
            if (arabicNum == -1) {
                arabicNum = ARABIC_NUM_ARR[ARABIC_NUM_ARR.length - 1];
                result.append(ROMAN_NUM_ARR[ARABIC_NUM_ARR.length - 1]);
            }
            remain = remain - arabicNum;
        }

        if (!romanNumIsCorrect(result.toString())) {
            result = new StringBuilder(alg2(n));
        }
        return result.toString();
    }

    private static String alg2(int n) {
        StringBuilder result = new StringBuilder("");
        int arabicMax = 0;
        for (int i = 0; i < ARABIC_NUM_ARR.length; i++) {
            if (ARABIC_NUM_ARR[i] > n) {
                arabicMax = ARABIC_NUM_ARR[i];
                result.append(ROMAN_NUM_ARR[i]);
                break;
            }
        }
        for (int i = ARABIC_NUM_ARR.length - 1; i >= 0; i--) {
            if ((arabicMax - ARABIC_NUM_ARR[i]) == n) {
                result.insert(0, ROMAN_NUM_ARR[i]);
                break;
            }
        }
        return result.toString();
    }

    public static int fromRoman(String romanNum) {
        int result = 0;
        for (int i = 0; i < romanNum.length(); i++) {
            if ((romanNum.length() == 1) || (i == romanNum.length() - 1) || ((i + 1 < romanNum.length())
                    && (getArabic(romanNum.charAt(i)) >= getArabic(romanNum.charAt(i + 1))))) {
                result += getArabic(romanNum.charAt(i));
            }
            if ((i + 1 < romanNum.length()) && (getArabic(romanNum.charAt(i)) < getArabic(romanNum.charAt(i + 1)))) {
                result = result + getArabic(romanNum.charAt(i + 1)) - getArabic(romanNum.charAt(i));
                if (i == romanNum.length() - 2) break;
            }
        }
        return result;
    }

    private static int getArabic(char ch) {
        int result = 0;
        for (int i = 0; i < ROMAN_NUM_ARR.length; i++) {
            if (ROMAN_NUM_ARR[i] == ch) {
                result = ARABIC_NUM_ARR[i];
                break;
            }
        }
        return result;
    }

    private static boolean romanNumIsCorrect(String romanNum) {
        boolean correct = true;
        for (int i = 0; i < romanNum.length(); i++) {
            if (twoInRowOrMoreThanThree(romanNum, i)) {
                correct = false;
                break;
            }
        }
        return correct;
    }

    private static boolean twoInRowOrMoreThanThree(String romanNum, int i) {
        return (twoInRow(romanNum, i, 'V') || twoInRow(romanNum, i, 'L') || twoInRow(romanNum, i, 'D')
                || moreThanThree(romanNum, i, 'I') || moreThanThree(romanNum, i, 'X') ||
                moreThanThree(romanNum, i, 'C') || moreThanThree(romanNum, i, 'M'));
    }

    private static boolean twoInRow(String romanNum, int i, char chr) {
        boolean result = false;
        if (i + 1 < romanNum.length() - 1) {
            if ((romanNum.charAt(i) == chr) && (romanNum.charAt(i + 1) == chr)) {
                result = true;
            }
        }
        return result;
    }

    private static boolean moreThanThree(String romanNum, int i, char chr) {
        boolean result = false;
        if (i + 3 < romanNum.length()) {
            if ((romanNum.charAt(i) == chr) && (romanNum.charAt(i + 1) == chr) && (romanNum.charAt(i + 2) == chr)
                    && (romanNum.charAt(i + 3) == chr)) {
                result = true;
            }
        }
        return result;
    }

}
