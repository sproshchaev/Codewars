package com.prosoft;

import java.util.ArrayList;
import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class Kata {

    public static long nextSmaller(long n) {
        char[] charArray = valueOf(n).toCharArray();
        boolean charArrayHasBeenChanged = false;
        boolean firstNumberWasFound = false;
        int indexRight = 0;
        int indexLeft = 0;
        do {
            charArrayHasBeenChanged = false;
            indexRight = charArray.length - 1;
            indexLeft = charArray.length - 2;
            while ((indexLeft >= 0) && (!firstNumberWasFound)) {
                if (Character.getNumericValue(charArray[indexLeft]) < Character.getNumericValue(charArray[indexRight])) {
                    swapElements(charArray, indexLeft, indexRight);
                    charArrayHasBeenChanged = true;
                }
                if ((charArrayToLong(charArray) > n)) {
                    firstNumberWasFound = true;
                    charArray = findFirstBigger(n, charArray);
                }
                indexRight--;
                indexLeft--;
            }
        } while ((charArrayHasBeenChanged) && (!firstNumberWasFound));
        return charArrayToLong(charArray) == n ? -1 : charArrayToLong(charArray);
    }

    private static char[] findFirstBigger(long n, char[] charArray) {
        ArrayList<Character> characterArrayList = new ArrayList<>();
        long firstBigNumber = 0;
        for (firstBigNumber = n + 1; firstBigNumber <= charArrayToLong(charArray); firstBigNumber++) {
            characterArrayList.clear();
            for (char c : valueOf(n).toCharArray()) {
                characterArrayList.add(c);
            }
            boolean foundAllDigit = true;
            for (char c : valueOf(firstBigNumber).toCharArray()) {
                if (!characterArrayList.remove(Character.valueOf(c))) {
                    foundAllDigit = false;
                    break;
                }
            }
            if (foundAllDigit) {
                break;
            }
        }
        return valueOf(firstBigNumber).toCharArray();
    }

    private static void swapElements(char[] charArray, int indexLeft, int indexRight) {
        int minVal = Character.getNumericValue(charArray[indexLeft]);
        charArray[indexLeft] = charArray[indexRight];
        charArray[indexRight] = Character.forDigit(minVal, 10);
    }

    private static long charArrayToLong(char[] chArr) {
        return Long.parseLong(Stream.of(chArr).map(String::valueOf).collect(joining()));
    }


}
