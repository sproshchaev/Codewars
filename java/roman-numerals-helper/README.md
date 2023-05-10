[![Codewars](https://img.shields.io/badge/Codewars-000000??style=for-the-badge&logo=Codewars&logoColor=B1361E)](https://www.codewars.com/)
[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Roman Numerals Helper https://www.codewars.com/kata/roman-numerals-helper
```
Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values will be 
tested for each function.
Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping 
any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 
2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").

Examples
  to roman:
        2000 -> "MM"
        1666 -> "MDCLXVI"
        1000 -> "M"
         400 -> "CD"
          90 -> "XC"
          40 -> "XL"
           1 -> "I"

  from roman:
        "MM"      -> 2000
        "MDCLXVI" -> 1666
        "M"       -> 1000
        "CD"      -> 400
        "XC"      -> 90
        "XL"      -> 40
        "I"       -> 1

  Help
       Symbol   Value
         I	      1
        IV	      4
         V	      5
         X	     10
         L	     50
         C	    100
         D	    500
         M	   1000
```
### Solution
```
Принципы римской системы счисления
В настоящее время в римской системе счисления используются следующие знаки:
   I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.
Все целые числа от 1 до 3999 записываются с помощью приведенных выше цифр. При этом:
1) если большая цифра стоит перед меньшей, они складываются:
   VI = 5 + 1 = 6; XV = 10 + 5 = 15; LX = 50 + 10 = 60; CL = 100 + 50 = 150;
2) если меньшая цифра стоит перед большей (в этом случае она не может повторяться), то меньшая вычитается из большей; вычитаться могут только цифры, обозначающие 1 или степени 10; уменьшаемым может быть только цифра, ближайшая в числовом ряду к вычитаемой:
   IV = 5 - 1 = 4; IX = 10 - 1 = 9; XL = 50 - 10 = 40; XC = 100 - 10 = 90;
3) цифры V, L, D не могут повторяться; цифры I, X, C, M могут повторяться не более трех раз подряд:
   VIII = 8; LXXX = 80; DCCC = 800; MMMD = 3500.

В алгоритмах реализован перебор двух зеркальных массивов, содержащих римские и арабские цифры.
   
```
### References
1. Конвертер римских чисел онлайн http://graecolatini.bsu.by/htm-different/num-converter-roman.htm 
2. JUnit Jupiter API https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
