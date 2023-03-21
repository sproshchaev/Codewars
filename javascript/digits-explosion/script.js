function explode(inString){
  let result = '';
  for (let i = 0; i < inString.length; i++) {
    for (let j = 0; j < Number(inString[i]); j++) {
      result += inString[i];
    }
  }
  console.log(result);
  return result;
}

explode('312');