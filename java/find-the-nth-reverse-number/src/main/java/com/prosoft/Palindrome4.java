package com.prosoft;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Palindrome4. Решение №3: все тесты проходят за 6 сек. Но не проходят по лимиту времени в ATTEMPT на Codewars.
 */
public class Palindrome4 {
    public static BigInteger findReverseNumber(long n) {
        String[] initArray = getStartBeginEnv(n);
        int lengthReverseNumber = Integer.valueOf(initArray[0]);
        long counterReverseNumbers = n > 1 ? Long.valueOf(initArray[1]) - 1 : Long.valueOf(initArray[1]);
        BigInteger reverseNumber = new BigInteger(initArray[2]);
        long min = Long.valueOf(initArray[3]);
        long max = Long.valueOf(initArray[4]);
        boolean stop = false;
        if (Long.valueOf(initArray[1]) == n) {
            stop = true;
        }
        while (!stop) {
            for (long i = min; i <= max; i++) {
                if (lengthReverseNumber == 1) {
                    counterReverseNumbers++;
                    if (n == counterReverseNumbers) {
                        reverseNumber = new BigInteger(String.valueOf(i));
                        stop = true;
                        break;
                    }
                } else {
                    if (lengthReverseNumber % 2 == 0) {
                        // 1|1
                        counterReverseNumbers++;
                        if (n == counterReverseNumbers) {
                            reverseNumber = new BigInteger(i + new StringBuilder(String.valueOf(i)).reverse().toString());
                            stop = true;
                            break;
                        }
                    } else {
                        if (counterReverseNumbers + 10 > n) {
                            for (int j = 0; j <= 9; j++) {
                                counterReverseNumbers++;
                                if (n == counterReverseNumbers) {
                                    reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + new StringBuilder(String.valueOf(i)).reverse().toString());
                                    stop = true;
                                    break;
                                }
                            }
                        } else {
                            counterReverseNumbers = counterReverseNumbers + 10;
                        }
                    }
                }
                if (stop) {
                    break;
                }
            }
            lengthReverseNumber++;
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

    /**
     * Метод getStartBeginEnv формирует начальные переменные окружения для n
     * см. README: II. "Интервалы и стартовое число в интервале с заданным числом разрядов"
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

    /**
     * Метод getStartEndEnv формирует начальные переменные окружения для n.
     * см. README: III. "Интервалы и максимальное число в интервале с заданным числом разрядов"
     *
     * @param n
     * @return
     */
    private static String[] getStartEndEnv(long n) {
        String[] result = new String[]{"1", "0", "-1", "0", "9"};
        long counterReverseNumbers = 10;
        BigInteger reverseNumber = BigInteger.valueOf(9);
        int lengthReverseNumber = 1;
        long min = 1;
        long max = 9;
        long deltaForCount = 9;
        boolean stop = false;
        List<String> stringList = new ArrayList<>();
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
                stringList.add(lengthReverseNumber + ";" + counterReverseNumbers + ";" + reverseNumber + ";" + min + ";" + max + ";");
            }
        }
        for (int i = stringList.size() - 1; i >= 0; i--) {
            if (n >= Long.valueOf(stringList.get(i).split(";")[1])) {
                result = stringList.get(i).split(";");
                break;
            }
        }
        return result;
    }
}
