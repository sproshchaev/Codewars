package com.prosoft;

import java.math.BigInteger;
import java.util.Arrays;

public class Palindrome {
    /**
     * Reverse Number is a number which is the same when reversed.
     * For example, the first 20 Reverse Numbers are:
     * 0,    1,    2,    3,    4,    5,    6,    7,    8,    9,  <-X,               дельта=1
     * 00,   11,   22,   33,   44,   55,   66,   77,   88,   99, <-Z,               дельта=11
     * 1X1,  2X2,  3X3,  4X4,  5X5,  6X6,  7X7,  8X8,  9X9,  9X9                    дельта=10
     * 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 1ZZ1, 2ZZ2, .., 9ZZ9,  дельта=110
     * 10001, 11X11, 12X21 ...                                                      дельта=1010
     * <p>
     * TASK: You need to return the nth reverse number. (Assume that reverse numbers start from 0 as shown in the example)
     * NOTES: 1 < n <= 100000000000
     *
     * @param n
     * @return
     */
    public static BigInteger findReverseNumber(long n) {
        long counterReverseNumbers = 0; // 1;
        System.out.println("Start for " + n);
        //
        boolean stop = false;
        char[] charArray = new char[1];
        // от [0] до [9] => [i]
        while (!stop) {
            if ((counterReverseNumbers < n) && (counterReverseNumbers < 10)) {
                counterReverseNumbers++;
                charArray[0] = (char) ((counterReverseNumbers - 1) + '0');
                System.out.println(counterReverseNumbers + "=" + Arrays.toString(charArray));
            } else {
                stop = true;
            }
        }

        // от [1, 1] до [9, 9]
        if (counterReverseNumbers < n) {
            stop = false;
            charArray = new char[2];
            int num = 0;
            while (!stop) {
                if ((counterReverseNumbers < n) && (counterReverseNumbers < 19)) {
                    num = num + 11;
                    counterReverseNumbers++;
                    charArray = String.valueOf(num).toCharArray();
                    System.out.println(counterReverseNumbers + "=" + Arrays.toString(charArray));
                } else {
                    stop = true;
                }
            }
        }

        // далее свыше [1, 0, 1] => [i, j, i]
        if (counterReverseNumbers < n) {
            stop = false;
            int i = 1;
            int j = 0;
            int lengthVar = 3;
            counterReverseNumbers = 19;
            while (!stop) {
                // ---- for i -----
                while (!stop) {
                    charArray = new char[lengthVar];
                    if (i > 9) {
                        i = 1;
                    }
                    charArray[0] = (char) (i + '0');
                    charArray[lengthVar - 1] = (char) (i + '0');

                    // ---- for j -----
                    while ((!stop) && (i < 10)) {

                        // [1, 2, 0, 2, 1]
                        // [1, 2, 1, 2, 1]
                        // [1, 2, 2, 2, 1] V lengthVar = 5, j = 2,
                        //
                        // ...
                        // [1, 3, 0, 0, 3, 1]
                        // [1, 3, 1, 1, 3, 1]
                        // [1, 3, 2, 2, 3, 1]
                        // [1, 3, 3, 3, 3, 1] V lengthVar = 6, j = 3,

                        for (int l = 0; l <= j; l++) {

                            for (int k = 1; k <= lengthVar - 2; k++) {
                                charArray[k] = (char) (j + '0');
                            }
                            counterReverseNumbers++;
                            System.out.println(counterReverseNumbers + "=" + Arrays.toString(charArray));
                        }


                        if (counterReverseNumbers == n) {
                            stop = true;
                        }

                        j++;

                        if ((j > 9) && (!stop)) {
                            j = 0;
                            i++;
                            charArray[0] = (char) (i + '0');
                            charArray[lengthVar - 1] = (char) (i + '0');
                        }

                    }
                    // ---- for j -----
                    //i++;
                    lengthVar++;
                }
                // ---- for i -----

            }
        }
        return new BigInteger(new String(charArray));
    }


}
