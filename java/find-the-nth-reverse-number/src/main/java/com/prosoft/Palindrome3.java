package com.prosoft;

import java.math.BigInteger;

/**
 * Решение 2
 */
public class Palindrome3 {
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
            numInLine++;
            if ((reverseNumber.equals(BigInteger.valueOf(-1))) || (reverseNumber.toString().length() % 2 != 0)) {

                //--- Проверяем позицию в строке от 1 до 10, после чего переход на новую
                if (numInLine > 10) {

                    // --- Проверка - если после прибавления дельты увеличится длина числа, то прибавляем не переход, а +2
                    if (reverseNumber.add(BigInteger.valueOf(deltaForNewLine)).toString().length() > lengthReverseNumber) {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(2)); // при увеличении длинны +2
                    } else {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    }

                    if (reverseNumber.equals(BigInteger.valueOf(11))) {
                        numInLine = 2;
                    } else {
                        numInLine = 1;
                    }

                } else {
                    // нечетное L=1, 3, ...
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierOddLength));
                }
            } else {

                //--- Проверяем позицию в строке от 1 до 10, после чего переход на новую
                if (numInLine > 10) {
                    //reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    // --- Проверка - если после прибавления дельты увеличится длина числа, то прибавляем не переход, а +2
                    if (reverseNumber.add(BigInteger.valueOf(deltaForNewLine)).toString().length() > lengthReverseNumber) {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(2)); // при увеличении длинны +2
                    } else {
                        reverseNumber = reverseNumber.add(BigInteger.valueOf(deltaForNewLine));
                    }

                    numInLine = 1;
                } else {
                    // четное L=2, 4, ...
                    reverseNumber = reverseNumber.add(BigInteger.valueOf(multiplierEvenLength));
                }
            }
            //numInLine++;
            //---- Формируем итерацию ----

            //--- Проверяем - изменилась ли длина lengthReverseNumber
            if (reverseNumber.toString().length() > lengthReverseNumber) {
                //
                lengthReverseNumber = reverseNumber.toString().length();
                System.out.println("new " + lengthReverseNumber + " " + reverseNumber);

                // множитель для четной длины, множитель для нечетной длины меняем на каждой l=3, 5
                if (lengthReverseNumber % 2 != 0) {
                    deltaForNewLine = multiplierEvenLength;
                    multiplierOddLength = multiplierOddLength * 10;
                    multiplierEvenLength = multiplierEvenLength * 10;

                }
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
