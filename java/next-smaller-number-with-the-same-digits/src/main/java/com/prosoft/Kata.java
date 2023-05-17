package com.prosoft;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static java.util.stream.Collectors.joining;

public class Kata {
    private static boolean stop;
    private static long n1;

    public static long nextSmaller(long n) {
        char[] arr = valueOf(n).toCharArray();
        boolean[] used = new boolean[arr.length];
        char[] res = new char[arr.length];
        n1 = n;
        stop = false;
        generateUniqueCombinations(arr, used, res, 0);
        return stop == false ? -1 : Long.parseLong(Stream.of(res).map(String::valueOf).collect(joining()));
    }

    public static void generateUniqueCombinations(char[] arr, boolean[] used, char[] res, int pos) {
        if (pos == arr.length) {
            System.out.println(Arrays.toString(res));
            if ((Long.parseLong(Stream.of(res).map(String::valueOf).collect(joining())) < n1) && (res[0] != '0')) {
                stop = true;
            }
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                res[pos] = arr[i];
                generateUniqueCombinations(arr, used, res, pos + 1);
                used[i] = false;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
            if (stop) break;
        }
    }

}
