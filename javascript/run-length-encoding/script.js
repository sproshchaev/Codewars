var runLengthEncoding = function (str) {
  let result = [];
  let index = 0;
  let currChar;
  let countChar = 0;
  while (index < str.length) {
    currChar = str[index];
    while ((currChar == str[index]) && (index < str.length)) {
      countChar++;
      index++;
    }
    result.push([countChar, currChar]);
    countChar = 0;
  }
  return result;
};

console.log(runLengthEncoding("")); // []
console.log(runLengthEncoding("abc")); // [[1,'a'],[1,'b'],[1,'c']]
console.log(runLengthEncoding("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW")); // [[12,'W'],[1,'B'],[12,'W'],[3,'B'],[24,'W'],[1,'B'],[14,'W']]
