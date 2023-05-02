package com.prosoft;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Palindrome3 {
    public static BigInteger findReverseNumber(long n) {
        /* lengthReverseNumber=1, counterReverseNumbers=0, reverseNumber=-1, min=0, max=9 */
        String[] initArray = getStartBeginEnv(n);
        //System.out.println("Для n=" + n + " initArray=" + Arrays.toString(initArray));
        int lengthReverseNumber = Integer.valueOf(initArray[0]); // 1;
        long counterReverseNumbers = n > 1 ? Long.valueOf(initArray[1]) - 1 : Long.valueOf(initArray[1]); // 0; // Если используем getStartEnv(), то XXX - 1
        BigInteger reverseNumber = new BigInteger(initArray[2]); // BigInteger.valueOf(-1);
        long min = Long.valueOf(initArray[3]); // 0;
        long max = Long.valueOf(initArray[4]); // 9;

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
                        // Проверяем - если counterReverseNumbers + 10 < n
                        if (counterReverseNumbers + 10 > n) {
                            for (int j = 0; j <= 9; j++) {
                                counterReverseNumbers++;
                                //---- Проверяем число ----
                                if (n == counterReverseNumbers) {
                                    reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + reverse(i));
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

            //System.out.println("length=" + lengthReverseNumber + ": число " + reverseNumber + " его номер=" + counterReverseNumbers + " min=" + min + " max=" + max);

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

    private static String[] getStartBeginEnv(long n) {
        String[] result = new String[]{"1", "0", "-1", "0", "9"};
        int lengthReverseNumber = 0;
        long counterReverseNumbers = 1;
        BigInteger reverseNumber = BigInteger.valueOf(0);
        long min = 0;
        long max = 9;
        List<String> stringList = new ArrayList<>();
        boolean stop = false;
        while (!stop) {

            //counterReverseNumbers++;
            lengthReverseNumber++;

            if (lengthReverseNumber % 2 != 0) {
                if (lengthReverseNumber > 1) {
                    // нечетное 3, 5, 7 ...
                    if (lengthReverseNumber == 3) {
                        counterReverseNumbers = 20;
                    } else {
                        counterReverseNumbers = 2 * min * 10;
                    }
                }
            } else {
                // четное 2, 4, 6 ...
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

            // reverseNumber
            if (lengthReverseNumber > 2) {
                // 101
                reverseNumber = new BigInteger("1" + String.join("", Collections.nCopies(lengthReverseNumber - 2, "0")) + "1");
            }

            // Проверяем результат
            if (lengthReverseNumber > 22) {
                stop = true;
            } else {
                //System.out.println("L=" + lengthReverseNumber + " count=" + counterReverseNumbers + " reverseNumber=" + reverseNumber + " min=" + min + " max=" + max);
                stringList.add(lengthReverseNumber + ";" + counterReverseNumbers + ";" + reverseNumber + ";" + min + ";" + max + ";");
            }

        }

        //
        // Теперь перебираем stringList
        for (int i = stringList.size() - 1; i >= 0; i--) {
            if (n > Long.valueOf(stringList.get(i).split(";")[1])) {
                //System.out.println(stringList.get(i));
                result = stringList.get(i).split(";");
                break;
            }
        }

        return result;
    }

    private static String[] getStartEnv(long n) {
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
                //System.out.println("L=" + lengthReverseNumber + " count=" + counterReverseNumbers + " reverseNumber=" + reverseNumber + " min=" + min + " max=" + max);
                stringList.add(lengthReverseNumber + ";" + counterReverseNumbers + ";" + reverseNumber + ";" + min + ";" + max + ";");
            }

        }

        // Теперь перебираем stringList
        for (int i = stringList.size() - 1; i >= 0; i--) {
            if (n > Long.valueOf(stringList.get(i).split(";")[1])) {
                //System.out.println(stringList.get(i));
                result = stringList.get(i).split(";");
                break;
            }
        }

        return result;
    }

    private static String reverse(long i) {
        return new StringBuilder(String.valueOf(i)).reverse().toString();
    }


}
