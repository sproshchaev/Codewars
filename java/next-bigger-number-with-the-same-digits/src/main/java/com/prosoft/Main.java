package com.prosoft;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Kata.nextBiggerNumber(2017)); // assertEquals(2071, Kata.nextBiggerNumber(2017));
        System.out.println(Kata.nextBiggerNumber(10990)); // assertEquals(19009, Kata.nextBiggerNumber(10990));
        System.out.println(Kata.nextBiggerNumber(513));
        System.out.println(Kata.nextBiggerNumber(9));
        System.out.println(Kata.nextBiggerNumber(12)); // assertEquals(21, Kata.nextBiggerNumber(12));
        System.out.println(Kata.nextBiggerNumber(144)); // assertEquals(414, Kata.nextBiggerNumber(144));
        System.out.println(Kata.nextBiggerNumber(59884848459853L)); // next bigger of 59884848459853 is 59884848483559
    }
}
