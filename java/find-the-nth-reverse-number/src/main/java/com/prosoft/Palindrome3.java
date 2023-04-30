package com.prosoft;

import java.math.BigInteger;


public class Palindrome3 {
    public static BigInteger findReverseNumber(long n) {
        // counterReverseNumbers=0, reverseNumber=-1, lengthReverseNumber=1, min=0, max=9
        //String[] init = getStartEnv(n);
        long counterReverseNumbers = 0;
        BigInteger reverseNumber = BigInteger.valueOf(-1);
        int lengthReverseNumber = 1;
        long min = 0;
        long max = 9;

        boolean stop = false;

        // Прибавить шаг, если изменяется длина, то переназначить переменные
        while (!stop) {

            for (long i = min; i <= max; i++) {

                if (lengthReverseNumber == 1) {
                    counterReverseNumbers++;
                    //---- Проверяем число ----
                    if (n == counterReverseNumbers) {
                        reverseNumber = new BigInteger(String.valueOf(i));
                        stop = true;
                        break;
                    }
                } else {

                    if (lengthReverseNumber % 2 == 0) {
                        // 1|1
                        counterReverseNumbers++;
                        //---- Проверяем число ----
                        if (n == counterReverseNumbers) {
                            reverseNumber = new BigInteger(String.valueOf(i) + reverse(i));
                            stop = true;
                            break;
                        }
                    } else {
                        // 1|0|1
                        for (int j = 0; j <= 9; j++) {
                            counterReverseNumbers++;
                            //---- Проверяем число ----
                            if (n == counterReverseNumbers) {
                                reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + reverse(i));
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

            //System.out.println("length=" + lengthReverseNumber + ": число " + reverseNumber + " его номер=" + counterReverseNumbers + " min=" + min + " max=" + max);

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
                max = Long.valueOf(String.valueOf(max) + "9");
            }


        }

        return reverseNumber;
    }

    private static String[] getStartEnv(long n) {
        // Получаем длину
        int lenN = String.valueOf(n).length();


            long counterReverseNumbers = 10;
            BigInteger reverseNumber = BigInteger.valueOf(9);
            int lengthReverseNumber = 1;
            long min = 1;
            long max = 9;
            long deltaForCount = 9;
            boolean stop = false;

            while (!stop) {


                lengthReverseNumber++;

                if (lengthReverseNumber % 2 != 0) {
                    deltaForCount = deltaForCount * 10;
                }

                counterReverseNumbers = counterReverseNumbers + deltaForCount;

                reverseNumber = new BigInteger(String.valueOf(reverseNumber) + "9");

                if ((lengthReverseNumber % 2 == 0) && (lengthReverseNumber > 2)) {
                    min = min * 10;
                    max = Long.valueOf(String.valueOf(max) + "9");
                }

                if (lengthReverseNumber > 21) {
                    stop = true;
                } else {
                    //System.out.println("L=" + lengthReverseNumber + " count=" + counterReverseNumbers + " reverseNumber=" + reverseNumber + " min=" + min + " max=" + max);
                }

            }
            return new String[]{String.valueOf(counterReverseNumbers),
                    String.valueOf(reverseNumber),
                    String.valueOf(min),
                    String.valueOf(max)};


    }

    private static String reverse(long i) {
        return new StringBuilder(String.valueOf(i)).reverse().toString();
    }


}
