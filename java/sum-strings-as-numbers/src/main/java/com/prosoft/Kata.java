package com.prosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    /**
     * Given the string representations of two integers, return the string representation of the sum of those integers.
     * For example: sumStrings('1','2') => '3', sumStrings('123', '456') => '579'.
     * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
     * I have removed the use of BigInteger and BigDecimal in java
     * Python: your solution need to work with huge numbers (about a milion digits), converting to int will not work.
     *
     * @param a
     * @param b
     * @return
     */
    public static String sumStrings(String a, String b) {
        // a = 123456768 массив char-ов
        // b = 000012345

        int maxLengthArray = Math.max(a.length(), b.length());
        char[] charsArrayA = fillArray(a, maxLengthArray);
        char[] charsArrayB = fillArray(b, maxLengthArray);

        System.out.println("a=" + Arrays.toString(charsArrayA));
        System.out.println("b=" + Arrays.toString(charsArrayB));

        // inMemory = 0
        // складываем 8 + 5 + inMemory = 3, inMemory = 1
        // складываем 6 + 4 + inMemory = 1, inMemory = 1
        // ...
        int inMemory = 0;
        int digitA = 0;
        int digitB = 0;
        int sum = 0;
        List<Character> resultList = new ArrayList<>();
        for (int i = maxLengthArray - 1; i >= 0; i--) {
            digitA = Character.getNumericValue(charsArrayA[i]);
            digitB = Character.getNumericValue(charsArrayB[i]);
            sum = digitA + digitB + inMemory;
            if (sum <= 9) {
                inMemory = 0;
            } else {
                sum = sum - 10;
                inMemory = 1;
            }
            resultList.add(Character.forDigit(sum, 10));
        }
        // Проверяем
        if (inMemory == 1) {
            resultList.add(Character.forDigit(inMemory, 10));
        }
        Collections.reverse(resultList);
        System.out.println(resultList.toString());
        return resultList.stream().map(Object::toString).collect(Collectors.joining());
    }

    private static char[] fillArray(String inString, int maxLengthArray) {
        char[] charsArray = new char[maxLengthArray];
        // Сначала заполняем нулями Arrays.fill(ar, 1, 5, 10);
        Arrays.fill(charsArray, 0, (maxLengthArray - inString.length()), '0');

        // Затем заполняем значениями
        int index = 0;
        for (int i = (maxLengthArray - inString.length()); i < maxLengthArray; i++) {
            charsArray[i] = inString.charAt(index++);
        }

        return charsArray;
    }
}
