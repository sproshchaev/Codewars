[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Adding Big Numbers https://www.codewars.com/kata/525f4206b73515bffb000b21
```
DESCRIPTION:
We need to sum big numbers and we require your help.
Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.

Example
  add("123", "321"); -> "444"
  add("11", "99");   -> "110"
  
Notes
 - The input numbers are big.
 - The input is a string of only digits
 - The numbers are positives
```
### Solution
Для решения задачи входящие строки с числами A и B преобразуются в массивы символов. Если есть ведущие '0',
то они удаляются. Массивы одновременно перебираются слева на право и складываются по разрядно. Если результат сложения
больше 9, то из результата вычитаем 10 и к следующему сложению прибавляем 1.

### References
1. Массивы в Java https://skillbox.ru/media/base/massivy_v_java_sozdayem_zapolnyaem_ispolzuem/
2. Преобразование между char и int в Java https://www.techiedelight.com/ru/conversion-between-char-and-int-java/
3. Arrays.fill() in Java with Examples https://www.geeksforgeeks.org/arrays-fill-java-examples/
4. Collections.reverse() Method in Java https://www.geeksforgeeks.org/collections-reverse-method-in-java-with-examples/
5. Joining Objects into a String https://coderwall.com/p/im4lja/joining-objects-into-a-string-with-java-8-stream-api
6. JUnit Jupiter API https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
