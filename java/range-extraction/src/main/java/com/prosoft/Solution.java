package com.prosoft;

public class Solution {
    /**
     * Method rangeExtraction
     * A format for expressing an ordered list of integers is to use a comma separated list of either
     *  - individual integers
     *  - or a range of integers denoted by the starting integer separated from the end integer in the range by a dash,
     *    '-'. The range includes all integers in the interval including both endpoints. It is not considered a range
     *    unless it spans at least 3 numbers. For example "12,13,15-17"
     * Complete the solution so that it takes a list of integers in increasing order and returns a correctly formatted
     * string in the range format.
     *
     * @param arr
     * @return
     */
    public static String rangeExtraction(int[] arr) {
        StringBuilder resultSb = new StringBuilder();
        int countDigitInInterval = 0;
        int index = 0;
        while (index < arr.length) {
            resultSb.append(arr[index]);
            while (((index + 1) < arr.length) && ((arr[index + 1] - arr[index]) == 1)) {
                countDigitInInterval++;
                index++;
            }
            if (countDigitInInterval == 1) {
                resultSb.append(",").append(arr[index]);
            }
            if (countDigitInInterval > 1) {
                resultSb.append("-").append(arr[index]);
            }
            if ((index + 1) < arr.length) {
                resultSb.append(",");
            }
            countDigitInInterval = 0;
            index++;
        }
        return resultSb.toString();
    }
}
