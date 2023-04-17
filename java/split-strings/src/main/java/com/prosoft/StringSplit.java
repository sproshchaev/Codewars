package com.prosoft;

public class StringSplit {

    /**
     * Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
     * number of characters then it should replace the missing second character of the final pair with an underscore ('_').
     * Examples:
     * * 'abc' =>  ['ab', 'c_']
     * * 'abcdef' => ['ab', 'cd', 'ef']
     *
     * @param s
     * @return
     */
    public static String[] solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(s.charAt(i));
            if (i % 2 != 0) {
                stringBuilder.append(";");
            }
        }
        if (s.length() % 2 != 0) {
            stringBuilder.append("_");
        }
        return stringBuilder.toString().split(";");
    }
}
