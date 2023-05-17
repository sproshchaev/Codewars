package com.prosoft;

import java.util.Arrays;

public class DescendingCombinations {
    public static void main(String[] args) {
        char[] arr = {'5', '3', '1'};
        int n = arr.length;
        boolean[] used = new boolean[n];
        char[] res = new char[n];
        generateDescendingCombinations(arr, n, used, res, 0);
    }

    public static void generateDescendingCombinations(char[] arr, int n, boolean[] used, char[] res, int pos) {
        if (pos == n) {
            System.out.println(Arrays.toString(res));
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (!used[i]) {
                used[i] = true;
                res[pos] = arr[i];
                generateDescendingCombinations(arr, n, used, res, pos + 1);
                used[i] = false;
                while (i > 0 && arr[i] == arr[i - 1]) {
                    i--;
                }
            }
        }
    }
}
