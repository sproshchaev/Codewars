package com.prosoft;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Kata {

    /**
     * Given the string representations of two integers, return the string representation of the sum of those integers.
     * For example: sumStrings('1','2') => '3', sumStrings('123', '456') => '579'.
     * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
     * I have removed the use of BigInteger and BigDecimal in java.
     *
     * @param a
     * @param b
     * @return
     */
    public static String sumStrings(String a, String b) {
        int maxLengthArray = Math.max(removeZeroLeft(a).length(), removeZeroLeft(b).length());
        char[] charsArrayA = fillArray(removeZeroLeft(a), maxLengthArray);
        char[] charsArrayB = fillArray(removeZeroLeft(b), maxLengthArray);
        List<Character> resultList = new ArrayList<>();
        int sum = 0;
        int inMemory = 0;
        for (int i = maxLengthArray - 1; i >= 0; i--) {
            sum = Character.getNumericValue(charsArrayA[i]) + Character.getNumericValue(charsArrayB[i]) + inMemory;
            inMemory = 0;
            if (sum > 9) {
                sum = sum - 10;
                inMemory = 1;
            }
            resultList.add(Character.forDigit(sum, 10));
        }
        if (inMemory == 1) {
            resultList.add(Character.forDigit(inMemory, 10));
        }
        Collections.reverse(resultList);
        return resultList.stream().map(Object::toString).collect(Collectors.joining());
    }

    private static char[] fillArray(String inString, int maxLengthArray) {
        char[] charsArray = new char[maxLengthArray];
        Arrays.fill(charsArray, 0, (maxLengthArray - inString.length()), '0');
        int index = 0;
        for (int i = (maxLengthArray - inString.length()); i < maxLengthArray; i++) {
            charsArray[i] = inString.charAt(index++);
        }
        return charsArray;
    }

    private static String removeZeroLeft(String inString) {
        List<Character> resultList = new ArrayList<>();
        boolean leftIsNotZero = false;
        for (char c : inString.toCharArray()) {
            if (c != '0') {
                leftIsNotZero = true;
            }
            if (leftIsNotZero == true) {
                resultList.add(c);
            }
        }
        return resultList.stream().map(Object::toString).collect(Collectors.joining());
    }
}
