package com.prosoft;

public class Snail {
    public static int[] snail(int[][] array) {

        int[] result = new int[array.length * array[0].length];

        // Обход массива
        //              a
        // array = [[1,2,3,3,3],
        //          [4,5,6,6,6],
        //        d [7,8,9,9,9], b
        //          [0,1,2,3,4],
        //          [5,6,7,8,9]]
        //               c
        // snail(array) #=> [1,2,3,6,9,8,7,4,5]
        for (int step = 0; step < 3; step++) {
            System.out.println("'Step: " + (step + 1) + "'");
            // a: 1,2,3,3
            System.out.print("a=");
            for (int i = step; i < array[step].length - step; i++) {
                System.out.print(array[step][i] + " ");
            }
            System.out.println("");
            // b: 3,6,9,4,9
            System.out.print("b=");
            for (int i = step + 1; i < array.length - step; i++) {
                System.out.print(array[i][array[i].length - 1 - step] + " ");
            }
            System.out.println("");
            // c: 9,8,7,6,5
            System.out.print("c=");
            for (int i = array[array.length - 1 - step].length - 1 - step - 1; i >= step; i--) {
                System.out.print(array[array.length - 1 - step][i] + " ");
            }
            System.out.println("");
            // d: 5, 0, 7, 4
            System.out.print("d=");
            for (int i = array.length - 1 - step - 1; i >= 1 + step; i--) {
                System.out.print(array[i][0 + step] + " ");
            }
            System.out.println("");
        }

        
        // enjoy
        return null;
    }
}
