[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Find the nth Reverse Number (Extreme) https://www.codewars.com/kata/600c18ec9f033b0008d55eec
```
DESCRIPTION:
    Reverse Number is a number which is the same when reversed.
    For example, the first 20 Reverse Numbers are:
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101
    TASK:
        You need to return the nth reverse number. (Assume that reverse numbers start from 0 as shown in the example.)
    NOTES:
        1 < n <= 100000000000
    
    Пример ряда:
                #1   #2   #3   #4   #5   #6   #7   #8   #9  #10
L=1    1 - 9:    0    1    2    3    4    5    6    7    8    9    дельта:   1
L=2    11-19:    -   11   22   33   44   55   66   77   88   99    дельта:  11
L=3,   20-29:  101  111  121  131  141  151  161  171  181  191    дельта:  10
       30-39:  202  212  222  232  242  252  262  272  282  292    дельта:  10
          ...
     100-109:  909  919  929  939  949  959  969  979  989  999    дельта:  10
       
L=4  110-119: 1001 1111 1221 1331 1441 1551 1661 1771 1881 1991    дельта: 110
         ...
     190-199: 9009 9119 9229 9339 9449 9559 9669 9779 9889 9999    дельта: 110
      
L=5  200-209: 10001 10101 11011 11111 10201 11211 11311 11411    ???                              дельта: 100, 910, 1010, 100

```
### Solution

### References
1. Большие числа BigInteger и BigDecimal https://metanit.com/java/tutorial/12.2.php
2. JUnit Jupiter API https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
