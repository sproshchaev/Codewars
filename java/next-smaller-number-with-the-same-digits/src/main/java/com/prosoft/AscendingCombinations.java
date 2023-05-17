package com.prosoft;

import java.util.Arrays;

public class AscendingCombinations {
    public static void main(String[] args) {
        char[] arr = {'5', '1', '3'};
        int n = arr.length;
        boolean[] used = new boolean[n];
        char[] res = new char[n];
        generateAscendingCombinations(arr, n, used, res, 0);
    }

    public static void generateAscendingCombinations(char[] arr, int n, boolean[] used, char[] res, int pos) {
        if (pos == n) {
            System.out.println(Arrays.toString(res));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                used[i] = true;
                res[pos] = arr[i];
                generateAscendingCombinations(arr, n, used, res, pos + 1);
                used[i] = false;
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
