package com.prosoft;

import java.math.BigInteger;

/**
 * Palindrome3. Решение №2: тесты проходят, но время исполнения на больших числах более 1 минуты
 */
public class Palindrome3 {
    public static BigInteger findReverseNumber(long n) {
        long counterReverseNumbers = 0;
        BigInteger reverseNumber = BigInteger.valueOf(-1);
        int lengthReverseNumber = 1;
        long multiplierOddLength = 1;
        long multiplierEvenLength = 11;
        long deltaForNewLine = 2;
        int numInLine = 0;
        boolean stop = false;
        while (!stop) {
            counterReverseNumbers++;
            numInLine++;
            if ((reverseNumber.equals(BigInteger.valueOf(-1))) || (reverseNumber.toString().length() % 2 != 0)) {
                if (numInLine > 10) {
                    if (reverseNumber.add(BigInteger.valueOf(deltaForNewLine)).toString().length() > lengthReverseNumber) {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(2));
                    } else {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    }
                    if (reverseNumber.equals(BigInteger.valueOf(11))) {
                        numInLine = 2;
                    } else {
                        numInLine = 1;
                    }
                } else {
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierOddLength));
                }
            } else {
                if (numInLine > 10) {
                    if (reverseNumber.add(BigInteger.valueOf(deltaForNewLine)).toString().length() > lengthReverseNumber) {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(2));
                    } else {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    }
                    numInLine = 1;
                } else {
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierEvenLength));
                }
            }
            if (reverseNumber.toString().length() > lengthReverseNumber) {
                lengthReverseNumber = reverseNumber.toString().length();
                if (lengthReverseNumber % 2 != 0) {
                    deltaForNewLine = multiplierEvenLength;
                    multiplierOddLength = multiplierOddLength * 10;
                    multiplierEvenLength = multiplierEvenLength * 10;
                }
            }
            if (n == counterReverseNumbers) {
                stop = true;
            }
        }
        return reverseNumber;
    }
}
