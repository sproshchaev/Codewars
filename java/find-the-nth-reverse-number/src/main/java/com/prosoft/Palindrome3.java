package com.prosoft;

import java.math.BigInteger;


public class Palindrome3 {
    public static BigInteger findReverseNumber(long n) {
        long counterReverseNumbers = 0;
        BigInteger reverseNumber = BigInteger.valueOf(-1);
        int lengthReverseNumber = 1;
        boolean stop = false;
        int min = 0;
        int max = 9;

        // Прибавить шаг, если изменяется длина, то переназначить переменные
        while (!stop) {

            for (long i = min; i <= max; i++) {


                if (lengthReverseNumber == 1) {
                    counterReverseNumbers++;
                    reverseNumber = new BigInteger(String.valueOf(i));
                    //---- Проверяем число ----
                    if (n == counterReverseNumbers) {
                        stop = true;
                        break;
                    }
                } else {

                    if (lengthReverseNumber % 2 == 0) {
                        // 1|1
                        counterReverseNumbers++;
                        reverseNumber = new BigInteger(String.valueOf(i) + reverse(i));
                        //---- Проверяем число ----
                        if (n == counterReverseNumbers) {
                            stop = true;
                            break;
                        }

                    } else {
                        // 1|0|1
                        for (int j = 0; j <= 9; j++) {
                            counterReverseNumbers++;
                            reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + reverse(i));
                            //---- Проверяем число ----
                            if (n == counterReverseNumbers) {
                                stop = true;
                                break;
                            }

                        }
                    }

                }
                if (stop) {
                    break;
                }
            }

            System.out.println("length=" + lengthReverseNumber + ": " + reverseNumber + " count=" + counterReverseNumbers);

            lengthReverseNumber++;

            // Увеличиваем
            if (min == 0) {
                min = 1;
            } else {
                if ((lengthReverseNumber % 2 == 0) && (lengthReverseNumber > 3)) {
                    min = min * 10;
                }
            }

            if ((lengthReverseNumber % 2 == 0) && (lengthReverseNumber > 3)) {
                max = Integer.valueOf(String.valueOf(max) + "9");
            }


        }

        return reverseNumber;
    }

    private static String reverse(long i) {
        if (String.valueOf(i).length() == 1) {
            return String.valueOf(i);
        } else {
            char[] charArray = String.valueOf(i).toCharArray();
            char[] reverseCharArray = new char[charArray.length];
            for (int j = 0; j < charArray.length; j++) {
                reverseCharArray[j] = charArray[charArray.length - 1 - j];
            }
            return String.valueOf(reverseCharArray);
        }
    }

}
