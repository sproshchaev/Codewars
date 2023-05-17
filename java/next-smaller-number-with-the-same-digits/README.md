[![Codewars](https://img.shields.io/badge/Codewars-000000??style=for-the-badge&logo=Codewars&logoColor=B1361E)](https://www.codewars.com/)
[![Java](https://img.shields.io/badge/Java-E43222??style=for-the-badge&logo=java&logoColor=FFFFFF)](https://java.com/)

# Codewars
4 kyu <br>
Next smaller number with the same digits https://www.codewars.com/kata/next-smaller-number-with-the-same-digits
```
  Write a function that takes a positive integer and returns the next smaller positive integer containing the same digits.

  For example:

  nextSmaller(21) == 12
  nextSmaller(531) == 513
  nextSmaller(2071) == 2017
  Return -1 (for Haskell: return Nothing, for Rust: return None), when there is no smaller number that contains the same 
  digits. Also return -1 when the next smaller number with the same digits would require the leading digit to be zero.

  nextSmaller(9) == -1
  nextSmaller(111) == -1
  nextSmaller(135) == -1
  nextSmaller(1027) == -1 // 0721 is out since we don't write numbers with leading zeros
  some tests will include very large numbers.
  test data only employs positive integers.
  The function you write for this challenge is the inverse of this kata: "Next bigger number with the same digits."
```
### Solution
```

         kod_massiva: 0 1 2              079                                0 1 2
                      0 2 1              097* - последний с предпоследним   1 2 0
                      1 0 2              709* - первый со вторым            2 0 1
                      1 2 0              790                                1 0 2 
                      2 0 1              907                                2 1 0
                      0 1 2 => 2 1 0     970                                0 2 1 

         kod_massiva: 0 1 2 3
                      0 1 3 2
                      0 3 1 2
                      0 3 2 1
                      1 0 2 3
                      1 0 3 2
                      1 2 3 0
                      1 3 2 0
                      2 0 1 3
                      2 3 0 1
                       

В этой программе используется рекурсивная функция generateUniqueCombinations, которая генерирует все уникальные комбинации из символов массива arr. Параметры функции:

- arr - исходный массив символов;
- n - размер массива;
- used - массив флагов, который указывает, использовался ли элемент массива arr в текущей комбинации;
- res - массив, в который записывается текущая комбинация;
- pos - текущая позиция в массиве res.

Функция работает следующим образом:

1. Если pos равно n, то текущая комбинация готова и выводится на экран.
2. Иначе перебираются все элементы массива arr, которые еще не использовались в текущей комбинации.
3. Если элемент еще не использовался, то он добавляется в текущую комбинацию и вызывается рекурсивно функция generateUniqueCombinations для следующей позиции.
4. После завершения рекурсивного вызова элемент удаляется из текущей комбинации и помечается как неиспользованный.
5. Если следующий элемент равен текущему, то пропускаются все равные элементы, чтобы избежать повторений комбинаций.

Таким образом, программа генерирует все уникальные комбинации из символов '0', '1' и '2', в которых каждое число не повторяется.   
```
### References
1. JUnit Jupiter API https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api
