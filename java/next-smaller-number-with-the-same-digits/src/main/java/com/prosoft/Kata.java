package com.prosoft;

import java.util.Arrays;

public class Kata {

    private static char[] chars;
    private static char[] kod_massiva;
    private static char[] baseArr;

    public static long nextSmaller(long n) {
        // Создаем массив
        chars = new char[String.valueOf(n).length()];
        baseArr = Long.toString(n).toCharArray();
        Arrays.sort(baseArr);
        chars = baseArr;

        // Создаем начальный код массива kod_massiva 0, 1, ...n
        kod_massiva = new char[String.valueOf(n).length()];
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            kod_massiva[i] = (char) (i + '0');
        }
        System.out.println("Начало: " + Arrays.toString(kod_massiva));
        ink_kod_massiva();
        ink_kod_massiva(); // 120
        ink_kod_massiva(); // 201
        ink_kod_massiva(); // 210
        ink_kod_massiva(); // 102

        return 0;
    }

    private static void ink_kod_massiva() {
        // kod_massiva: 0 1 2              079
        //              0 2 1              097* - последний с предпоследним
        //              1 0 2              709* - первый со вторым
        //              1 2 0              790
        //              2 0 1              907
        //              0 1 2 => 2 1 0     970
        // Первый символ запоминаем
        char firstCh = kod_massiva[0];
        // Со второго и по последний берем и сдвигаем влево
        for (int i = 0; i < kod_massiva.length - 1; i++) {
            kod_massiva[i] = kod_massiva[i + 1];
        }
        // Записываем firstCh в последний
        kod_massiva[kod_massiva.length - 1] = firstCh;
        // Если у нас при очередном сдвиге получается начальное значение, то 1-ый и последний меняем местами
        if (kod_massiva[0] == '0') {
            kod_massiva[kod_massiva.length - 1] = kod_massiva[0];
            kod_massiva[0] = firstCh;
        }
        System.out.println("        " + Arrays.toString(kod_massiva));

    }

}
