function myLanguages(results) {
  const MIN_SCORE = 60;
  let keyValueArray = [];
  for (let field in results) {
    keyValueArray.push(field + ":" + results[field]);
  }
  console.log(keyValueArray); 
  keyValueArray = keyValueArray.sort((inA, inB) => {
    return (Number(inB.substring(inB.indexOf(":") + 1)) -
      Number(inA.substring(inA.indexOf(":") + 1)));
  });
  return keyValueArray
    .filter((item) => Number(item.substring(item.indexOf(":") + 1)) >= MIN_SCORE)
    .map((item) => item.substring(0, item.indexOf(":")));
}

console.log(myLanguages({ Java: 10, Ruby: 80, Python: 65 })); // ["Ruby", "Python"]
console.log(myLanguages({ Hindi: 60, Dutch: 93, Greek: 71 })); // ["Dutch", "Greek", "Hindi"]
console.log(myLanguages({ "C++": 50, ASM: 10, Haskell: 20 })); // []
console.log(myLanguages({ R: 69, Swift: 78, 'Objective-C': 100, PHP: 4, Groovy: 95 })); // 'Objective-C', 'Groovy', 'Swift', 'R'
