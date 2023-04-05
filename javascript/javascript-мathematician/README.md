[![HTML](https://img.shields.io/badge/HTML-E46035??style=for-the-badge&logo=HTML5&logoColor=FFFFFF)](https://html.spec.whatwg.org/multipage/)
[![JavaScript](https://img.shields.io/badge/JavaScript-000000??style=for-the-badge&logo=JavaScript&logoColor=F3E050)](https://developer.mozilla.org/)

# Codewars
Javascript Mathematician https://www.codewars.com/kata/javascript-mathematician 

### References
1. Возврат функций из функций https://ru.hexlet.io/courses/js-functions-hard-way/lessons/return-function/theory_unit
2. Стрелочные функции. Лучшей заменой объекта arguments в стрелочных функциях являются остаточные параметры https://developer.mozilla.org/ru/docs/Web/JavaScript/Reference/Functions/Arrow_functions
3. Еще вариант реализации более сокращенный:
```
    const calculate = (...args1) => (...args2) => [...args1,...args2].reduce((a, b)=> a + b);
```