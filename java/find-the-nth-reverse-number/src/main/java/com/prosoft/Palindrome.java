package com.prosoft;

import java.math.BigInteger;
import java.util.Collections;

/**
 * Palindrome. Решение №3: все тесты проходят за 59 мс.
 */
public class Palindrome {

    /**
     * Reverse Number is a number which is the same when reversed.
     * For example, the first 20 Reverse Numbers are:
     * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101
     * TASK: You need to return the nth reverse number. (Assume that reverse numbers start from 0 as shown in the example.)
     * NOTES: 1 < n <= 100000000000
     *
     * @param n
     * @return
     */
    public static BigInteger findReverseNumber(long n) {
        String[] initArray = getStartBeginEnv(n);
        int lengthReverseNumber = Integer.parseInt(initArray[0]);
        long counterReverseNumbers = Long.parseLong(initArray[1]);
        BigInteger reverseNumber = new BigInteger(initArray[2]);
        long min = Long.parseLong(initArray[3]);
        if (n < 11) {
            reverseNumber = new BigInteger(String.valueOf(n - 1));
        } else {
            if (lengthReverseNumber % 2 != 0) {
                reverseNumber = buildNumberForOddLength(n, min, counterReverseNumbers);
            }
            if (lengthReverseNumber % 2 == 0) {
                reverseNumber = buildNumberForEvenLength(n, min, counterReverseNumbers);
            }
        }
        return reverseNumber;
    }

    private static BigInteger buildNumberForOddLength(long n, long min, long count) {
        final int DEC = 10;
        long integerPart = (long) (((n - count) / (double) DEC));
        long firstDecimal = (long) (Math.floor(((n - count) / (double) DEC) * DEC) % DEC);
        return new BigInteger(String.valueOf(min + integerPart) + String.valueOf(firstDecimal)
                + new StringBuilder(String.valueOf(min + integerPart)).reverse().toString());
    }

    private static BigInteger buildNumberForEvenLength(long n, long min, long count) {
        long startingPosition = n - count + min;
        return new BigInteger(String.valueOf(startingPosition)
                + new StringBuilder(String.valueOf(startingPosition)).reverse().toString());
    }

    /**
     * Метод getStartBeginEnv формирует начальные переменные окружения для n
     *
     * @param n
     * @return [lengthReverseNumber (1), counterReverseNumbers (0), reverseNumber (-1), min (0), max (9)]
     */
    private static String[] getStartBeginEnv(long n) {
        String[] result = new String[]{"1", "0", "-1", "0", "9"};
        int lengthReverseNumber = 0;
        long counterReverseNumbers = 1;
        BigInteger reverseNumber = BigInteger.valueOf(0);
        long min = 0;
        long max = 9;
        String[] stringArray = new String[22];
        int index = 0;
        boolean stop = false;
        while (!stop) {
            lengthReverseNumber++;
            if (lengthReverseNumber % 2 != 0) {
                if (lengthReverseNumber > 1) {
                    if (lengthReverseNumber == 3) {
                        counterReverseNumbers = 20;
                    } else {
                        counterReverseNumbers = 2 * min * 10;
                    }
                }
            } else {
                if (lengthReverseNumber == 2) {
                    min = 1;
                    counterReverseNumbers = 11;
                    reverseNumber = BigInteger.valueOf(11);
                } else {
                    min = min * 10;
                    max = Long.valueOf(String.join("", Collections.nCopies(lengthReverseNumber / 2, "9")));
                    counterReverseNumbers = 11 * min;
                }
            }
            if (lengthReverseNumber > 2) {
                reverseNumber = new BigInteger("1" + String.join("", Collections.nCopies(lengthReverseNumber - 2, "0")) + "1");
            }
            if (lengthReverseNumber > 22) {
                stop = true;
            } else {
                stringArray[index++] = lengthReverseNumber + ";" + counterReverseNumbers + ";" + reverseNumber + ";" + min + ";" + max + ";";
            }
        }
        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (n >= Long.valueOf(stringArray[i].split(";")[1])) {
                result = stringArray[i].split(";");
                break;
            }
        }
        return result;
    }
}
