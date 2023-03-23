function duplicateEncode(word){
  let result = '';
  let countSymbol = 0;
  for (let i = 0; i < word.length; i++) {
    countSymbol = 0;
    for (let j = 0; j < word.length; j++) {
      if (word[i].toUpperCase() == word[j].toUpperCase()) {
        countSymbol++;
      }    
    } 
    if (countSymbol == 1) {
      result += '(';
    } else {
      result += ')';
    }
  }
  console.log(result);
  return result;
}

duplicateEncode('din');
duplicateEncode('recede');
duplicateEncode('Success');
duplicateEncode('(( @');