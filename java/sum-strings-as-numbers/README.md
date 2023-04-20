[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Sum Strings as Numbers https://www.codewars.com/kata/5324945e2ece5e1f32000370/train/java
```
DESCRIPTION:
Given the string representations of two integers, return the string representation of the sum of those integers.

For example:

sumStrings('1','2') // => '3'
A string representation of an integer will contain no characters besides the ten numerals "0" to "9".

I have removed the use of BigInteger and BigDecimal in java

Python: your solution need to work with huge numbers (about a milion digits), converting to int will not work.
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
