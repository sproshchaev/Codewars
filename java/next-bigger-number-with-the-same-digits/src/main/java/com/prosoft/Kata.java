package com.prosoft;

import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Kata {
    public static long nextBiggerNumber(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        boolean charArrayHasBeenChanged = false;
        boolean firstNumberWasFound = false;
        int minVal = 0;
        int indexRight = 0;
        int indexLeft = 0;
        do {
            charArrayHasBeenChanged = false;
            indexRight = charArray.length - 1;
            indexLeft = charArray.length - 2;
            while ((indexLeft >= 0) && (!firstNumberWasFound)) {
                if (Character.getNumericValue(charArray[indexLeft]) < Character.getNumericValue(charArray[indexRight])) {
                    minVal = Character.getNumericValue(charArray[indexLeft]);
                    charArray[indexLeft] = charArray[indexRight];
                    charArray[indexRight] = Character.forDigit(minVal, 10);
                    charArrayHasBeenChanged = true;
                }
                if ((charArrayToLong(charArray) > n)) {
                    firstNumberWasFound = true;
                    // Получили из 10990 результат 19090, но есть ли меньшее?
                    if ((changeLastTwoDigit(charArrayToLong(charArray)) > n) && (changeLastTwoDigit(charArrayToLong(charArray)) < charArrayToLong(charArray))) {
                        indexRight = charArray.length - 1;
                        indexLeft = charArray.length - 2;
                        minVal = Character.getNumericValue(charArray[indexLeft]);
                        charArray[indexLeft] = charArray[indexRight];
                        charArray[indexRight] = Character.forDigit(minVal, 10);
                    }
                }
                indexRight = indexRight - 1;
                indexLeft = indexLeft - 1;
            }
        } while ((charArrayHasBeenChanged) && (!firstNumberWasFound));

        return charArrayToLong(charArray) == n ? -1 : charArrayToLong(charArray);
    }

    private static long charArrayToLong(char[] chArr) {
        return Long.parseLong(Stream.of(chArr)
                .map(String::valueOf).collect(joining()));
    }

    // change the last two
    private static long changeLastTwoDigit(long longVar) {
        char[] charArray = String.valueOf(longVar).toCharArray();
        if (charArray.length >= 2) {
            int minVal = 0;
            int indexRight = charArray.length - 1;
            int indexLeft = charArray.length - 2;
            minVal = Character.getNumericValue(charArray[indexLeft]);
            charArray[indexLeft] = charArray[indexRight];
            charArray[indexRight] = Character.forDigit(minVal, 10);
            return charArrayToLong(charArray);
        } else {
            return longVar;
        }
    }

}
