package com.prosoft;

import java.math.BigInteger;

public class Palindrome2 {
    public static BigInteger findReverseNumber(long n) {
        long counterReverseNumbers = 0;
        BigInteger reverseNumber = BigInteger.valueOf(-1);
        int lengthReverseNumber = 1;

        // множитель для четной длины, множитель для нечетной длины
        long multiplierOddLength = 1;
        long multiplierEvenLength = 11;

        // дельта при переходе на новую строку
        long deltaForNewLine = 2;

        // число в строке
        int numInLine = 0;
        boolean stop = false;
        // Прибавить шаг, если изменяется длина, то переназначить переменные
        while (!stop) {

            //---- Формируем итерацию ----
            counterReverseNumbers++;
            if ((reverseNumber.equals(BigInteger.valueOf(-1))) || (reverseNumber.toString().length() % 2 != 0)) {

                //--- Проверяем позицию в строке от 1 до 10, после чего переход на новую
                if (numInLine > 10) {
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    numInLine = 0;
                } else {
                    // нечетное 1, 3, ...
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierOddLength));
                }
            } else {
                //--- Проверяем позицию в строке от 1 до 10, после чего переход на новую
                if (numInLine > 10) {
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    numInLine = 0;
                } else {
                    // четное 2, 4, ...
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierEvenLength));
                }
            }
            numInLine++;
            //---- Формируем итерацию ----

            //--- Проверяем - изменилась ли длина lengthReverseNumber
            if (reverseNumber.toString().length() > lengthReverseNumber) {
                lengthReverseNumber = reverseNumber.toString().length();
                // множитель для четной длины, множитель для нечетной длины
                multiplierOddLength = multiplierOddLength * 10;
                multiplierEvenLength = multiplierEvenLength * 10;
            }
            //--- Проверяем - изменилась ли длина lengthReverseNumber

            //---- Проверяем число ----
            if (n == counterReverseNumbers) {
                stop = true;
            }
            //---- Проверяем число ----

        }

        return reverseNumber;
    }


}
