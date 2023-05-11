[![Codewars](https://img.shields.io/badge/Codewars-000000??style=for-the-badge&logo=Codewars&logoColor=B1361E)](https://www.codewars.com/)
[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Snail https://www.codewars.com/kata/snail
```
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]

For better understanding, please follow the numbers of the next array consecutively:
array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]
NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.
NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].
```
### Solution
```
      Обход массива по схеме "улитка": разбиваем обход по внешнему контуру массива на шаги a (1,2,3,3,3), b (6,9,4,9,), 
      c (8,7,6,5), d (0,7,4). На каждом следующем шаге изменяем контур массива до того момента, пока результат 
      в очередном шаге не будет возвращать пустые массивы (по a,b,c,d) 
                    a
      array = [[1,2,3,3,3],
               [4,5,6,6,6],
             d [7,8,9,9,9], b
               [0,1,2,3,4],
               [5,6,7,8,9]]
                    c
      snail(array) => [1,2,3,3,3,6,9,4,9,8,7,6,5,0,7,4,5,6,6,9,3,2,1,8,9]
   
```
### References
1. Число элементов в двумерном массиве Java https://vk.com/@prosoft72-chislo-elementov-v-dvumernom-massive-java
2. JUnit Jupiter API https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
