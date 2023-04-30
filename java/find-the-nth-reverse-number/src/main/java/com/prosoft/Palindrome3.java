package com.prosoft;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Palindrome3 {
    public static BigInteger findReverseNumber(long n) {
        /* lengthReverseNumber=1, counterReverseNumbers=0, reverseNumber=-1, min=0, max=9 */
        String[] initArray = new String[] {"4", "110", "1001", "10", "99"}; // getStartBeginEnv(n);
        // String[] initArray = new String[]{"1", "0", "-1", "0", "9"};
        // String[] initArray = getStartEnv(n);
        // String[] initArray = new String[] {"4", "110", "1001", "10", "99"};

        System.out.println("Для n=" + n + " initArray=" + Arrays.toString(initArray));

        int lengthReverseNumber = Integer.valueOf(initArray[0]); // 1;
        long counterReverseNumbers = Long.valueOf(initArray[1]) - 1; // 0; // Если используем getStartEnv(), то XXX - 1
        BigInteger reverseNumber = new BigInteger(initArray[2]); // BigInteger.valueOf(-1);
        long min = Long.valueOf(initArray[3]); // 0;
        long max = Long.valueOf(initArray[4]); // 9;

        boolean stop = false;

        // Прибавить шаг, если изменяется длина, то переназначить переменные
        while (!stop) {

            for (long i = min; i <= max; i++) {

                if (lengthReverseNumber == 1) {
                    counterReverseNumbers++;
                    // del
                    reverseNumber = new BigInteger(String.valueOf(i));
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
                        // del
                        reverseNumber = new BigInteger(String.valueOf(i) + reverse(i));
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
                            // del
                            reverseNumber = new BigInteger(String.valueOf(i) + String.valueOf(j) + reverse(i));

                            //--- del
                            if (j == 0) {
                                //System.out.println("length=" + lengthReverseNumber + ": число " + reverseNumber + " его номер=" + counterReverseNumbers + " min=" + min + " max=" + max);
                            }
                            //---

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
