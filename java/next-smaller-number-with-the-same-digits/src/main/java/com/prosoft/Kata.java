package com.prosoft;

import java.util.ArrayList;
import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class Kata {

    public static long nextSmaller(long n) {
        char[] charArray = valueOf(n).toCharArray();
        boolean charArrayHasBeenChanged = false, firstNumberWasFound = false;
        int indexRight = 0, indexLeft = 0;
        do {
            charArrayHasBeenChanged = false;
            indexRight = charArray.length - 1;
            indexLeft = charArray.length - 2;
            while ((indexLeft >= 0) && (!firstNumberWasFound)) {
                if (Character.getNumericValue(charArray[indexLeft]) > Character.getNumericValue(charArray[indexRight])) {
                    swapElements(charArray, indexLeft, indexRight);
                    charArrayHasBeenChanged = true;
                }
                if (((charArrayToLong(charArray) < n))) {
                    firstNumberWasFound = true;
                    charArray = findFirstSmaller(n, charArray);
                }
                indexRight--;
                indexLeft--;
            }
        } while ((charArrayHasBeenChanged) && (!firstNumberWasFound));
        return (charArrayToLong(charArray) == n) || (charArray.length != valueOf(n).toCharArray().length) ? -1
                : charArrayToLong(charArray);
    }

    private static char[] findFirstSmaller(long n, char[] charArray) {
        ArrayList<Character> characterArrayList = new ArrayList<>();
        long firstBigSmall = 0;
        for (firstBigSmall = n - 1; firstBigSmall > charArrayToLong(charArray); firstBigSmall--) {
            characterArrayList.clear();
            for (char c : valueOf(n).toCharArray()) {
                characterArrayList.add(c);
            }
            boolean foundAllDigit = true;
            for (char c : valueOf(firstBigSmall).toCharArray()) {
                if (!characterArrayList.remove(Character.valueOf(c))) {
                    foundAllDigit = false;
                    break;
                }
            }
            if (foundAllDigit) {
                break;
            }
        }
        return valueOf(firstBigSmall).toCharArray();
    }

    private static void swapElements(char[] charArray, int indexLeft, int indexRight) {
        int minVal = Character.getNumericValue(charArray[indexRight]);
        charArray[indexRight] = charArray[indexLeft];
        charArray[indexLeft] = Character.forDigit(minVal, 10);
    }

    private static long charArrayToLong(char[] chArr) {
        return Long.parseLong(Stream.of(chArr).map(String::valueOf).collect(joining()));
    }


}
