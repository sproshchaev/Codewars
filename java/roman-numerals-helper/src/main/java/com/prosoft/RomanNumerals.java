package com.prosoft;

public class RomanNumerals {

    public static String toRoman(int n) {
        StringBuilder result = new StringBuilder();
        String[] romanNum = new String[]{"I", "IV", "V", "X", "L", "C", "D", "M"};
        int[] arabicNum = new int[]{1, 4, 5, 10, 50, 100, 500, 1000};
        // --- 1-ый вариант
        int ostatok = n;
        int curr = -1;
        while (ostatok > 0) {
            curr = -1;
            for (int i = 0; i < arabicNum.length; i++) {
                if ((ostatok >= arabicNum[i]) && (i < arabicNum.length - 1) && (ostatok < arabicNum[i + 1])) {
                    curr = arabicNum[i];
                    result.append(romanNum[i]);
                    break;
                }
            }
            if (curr == -1) {
                curr = arabicNum[arabicNum.length - 1];
                result.append(romanNum[arabicNum.length - 1]);
            }
            ostatok = ostatok - curr;
        }
        // Выполнить проверку: цифры V, L, D не могут повторяться; цифры I, X, C, M могут повторяться не более трех раз подряд
        if (!romanNumIsCorrect(result.toString())) {
            // --- 2-ой вариант (для 90) находим 100 и далее вычитаем
            System.out.println("По второму варианту!");

        }
        return result.toString();
    }

    public static int fromRoman(String romanNumeral) {
        return 0;
    }

    // цифры V, L, D не могут повторяться; цифры I, X, C, M могут повторяться не более трех раз подряд
    private static boolean romanNumIsCorrect(String romanNumeral) {
        boolean correct = true;
        for (int i = 0; i < romanNumeral.length(); i++) {
            if (twoInRowOrMoreThanThree(romanNumeral, i)) {
                correct = false;
                break;
            }
        }
        return correct;
    }

    private static boolean twoInRowOrMoreThanThree(String romanNumeral, int i) {
        return (twoInRow(romanNumeral, i, 'V') || twoInRow(romanNumeral, i, 'L') || twoInRow(romanNumeral, i, 'D')
                || moreThanThree(romanNumeral, i, 'I') || moreThanThree(romanNumeral, i, 'X') ||
                moreThanThree(romanNumeral, i, 'C') || moreThanThree(romanNumeral, i, 'M'));
    }

    private static boolean twoInRow(String romanNumeral, int i, char chr) {
        boolean result = false;
        if (i + 1 < romanNumeral.length() - 1) {
            if ((romanNumeral.charAt(i) == chr) && (romanNumeral.charAt(i + 1) == chr)) {
                result = true;
            }
        }
        return result;
    }

    private static boolean moreThanThree(String romanNumeral, int i, char chr) {
        boolean result = false;
        if (i + 3 < romanNumeral.length()) {
            if ((romanNumeral.charAt(i) == chr) && (romanNumeral.charAt(i + 1) == chr) && (romanNumeral.charAt(i + 2) == chr)
                    && (romanNumeral.charAt(i + 3) == chr)) {
                result = true;
            }
        }
        return result;
    }

}
