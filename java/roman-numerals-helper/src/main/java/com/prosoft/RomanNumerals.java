package com.prosoft;

public class RomanNumerals {

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        String[] romanNum = new String[]{"I", "IV", "V", "X", "L", "C", "D", "M"};
        int[] arabicNum = new int[] {1, 4, 5, 10, 50, 100, 500, 1000};
        int ostatok = n;
        int curr = -1;
        while (ostatok > 0) {
            curr = -1;
            for (int i = 0; i < arabicNum.length; i++) {
                if ((ostatok >= arabicNum[i]) && (i < arabicNum.length - 1) && (ostatok < arabicNum[i + 1]))  {
                    curr = arabicNum[i];
                    result.append(romanNum[i]);
                    break;
                }
            }
            if (curr == -1) {
                curr = arabicNum[arabicNum.length - 1];
                result.append(romanNum[arabicNum.length -1]);
            };
            ostatok = ostatok - curr;
        }
        return result.toString();

    }

    public static int fromRoman(String romanNumeral) {
        return 0;
    }

}
