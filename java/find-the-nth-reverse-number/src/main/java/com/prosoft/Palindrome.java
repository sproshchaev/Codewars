package com.prosoft;

import java.math.BigInteger;
import java.util.Collections;


public class Palindrome {
    public static BigInteger findReverseNumber(long n) {
        String[] initArray = getStartBeginEnv(n);
        int lengthReverseNumber = Integer.valueOf(initArray[0]);
        long counterReverseNumbers = n > 1 ? Long.valueOf(initArray[1]) - 1 : Long.valueOf(initArray[1]);
        BigInteger reverseNumber = new BigInteger(initArray[2]);
        long min = Long.valueOf(initArray[3]);
        long max = Long.valueOf(initArray[4]);
        boolean stop = false;

        //boolean setMin = false;
        long oldMin = 0;

        while (!stop) {

          //  setMin = true;

            // Для четных - здесь изменить min
            if ((lengthReverseNumber % 2 == 0) && ((counterReverseNumbers + max - min + 1) > n)) {
                System.out.println("lengthReverseNumber=" + lengthReverseNumber);
                //min = (n - counterReverseNumbers + min);
                //counterReverseNumbers = counterReverseNumbers + (n - counterReverseNumbers + min);
            }

            // Для нечетных - здесь изменить min
            if ((lengthReverseNumber % 2 != 0) && ((counterReverseNumbers + max - min + 1) * 10 > n)) {
                //System.out.println("lengthReverseNumber=" + lengthReverseNumber);
                //oldMin = min;
                //min = min + ((long) Math.floor((n - counterReverseNumbers) / min)) ;//- 1;
                //counterReverseNumbers = counterReverseNumbers + 10 * ((long) Math.floor((n - counterReverseNumbers) / oldMin));
                // "findReverseNumber(300) => 20002"
                // i = 19
                // count = 299
            }

            int _delME = 0;

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
                        //System.out.println("+1 = " + ++_delME);
                        if (n == counterReverseNumbers) {
                            reverseNumber = new BigInteger(i + new StringBuilder(String.valueOf(i)).reverse().toString());
                            stop = true;
                            break;
                        }
                    } else {
                        // 1|0|1 Проверяем - если counterReverseNumbers + 10 < n то цикл пропускаем
                        if (counterReverseNumbers + 10 > n) {
                            for (int j = 0; j <= 9; j++) {
                                counterReverseNumbers++;
                                //System.out.println("+1 = " + ++_delME);
                                if (n == counterReverseNumbers) {
                                    reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + new StringBuilder(String.valueOf(i)).reverse().toString());
                                    stop = true;
                                    break;
                                }
                            }
                        } else {
                            counterReverseNumbers = counterReverseNumbers + 10;
                            //System.out.println("+10 = " + ++_delME);
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
                //setMin = true;
            } else {
                if ((lengthReverseNumber % 2 == 0) && (lengthReverseNumber > 3)) {
                    min = min * 10;
                    //setMin = true;
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
            if (n > Long.valueOf(stringArray[i].split(";")[1])) {
                result = stringArray[i].split(";");
                break;
            }
        }
        return result;
    }
}
